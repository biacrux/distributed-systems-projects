package pt.ipb.sd.components.country;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    private final RestClient restClient;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country findById(Long id) {
        return countryRepository.findById(id).orElseThrow(() -> new RuntimeException("Country not found: " + id));
    }

    public Country fetchAndSave(String name) {
        RestCountryDto[] results = restClient.get()
                .uri("/name/{name}?fullText=true", name)
                .retrieve()
                .body(RestCountryDto[].class);

        if (results == null || results.length == 0) {
            throw new RuntimeException("Country not found: " + name);
        }

        RestCountryDto dto = results[0];
        String commonName = dto.name() != null ? dto.name().common() : name;

        return countryRepository.findByName(commonName).orElseGet(() -> {
            String capital =
                    dto.capital() != null && !dto.capital().isEmpty() ?
                            dto.capital().get(0) : null;

            return countryRepository.save(Country.builder()
                    .name(commonName)
                    .capital(capital)
                    .population(dto.population())
                    .region(dto.region())
                    .build());
        });
    }

    public Country updateNotes(Long id, String notes) {
        Country country = findById(id);
        country.setNotes(notes);
        return countryRepository.save(country);
    }

    public void delete(Long id) {
        countryRepository.deleteById(id);
    }
}
