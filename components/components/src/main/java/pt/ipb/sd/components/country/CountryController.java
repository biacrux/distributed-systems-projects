package pt.ipb.sd.components.country;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("{id}")
    public Country getCountryById(@PathVariable Long id) {
        return countryService.findById(id);
    }

    @PostMapping("/fetch/{name}")
    public Country fetchCountryByName(@PathVariable String name) {
        return countryService.fetchAndSave(name);
    }

    @PutMapping("/{id}/notes")
    public Country updateNotes(@PathVariable Long id,
                               @RequestBody Map<String, String> body) {
        return countryService.updateNotes(id, body.get("notes"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable Long id) {
        countryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
