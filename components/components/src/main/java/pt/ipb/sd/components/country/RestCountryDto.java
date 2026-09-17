package pt.ipb.sd.components.country;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RestCountryDto(
        Name name,
        List<String> capital,
        Long population,
        String region) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Name(String common, String official) {
    }
}
