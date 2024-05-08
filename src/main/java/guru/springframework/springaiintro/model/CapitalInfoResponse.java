package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record CapitalInfoResponse(
        @JsonPropertyDescription("The name of the capital city") String capital,
        @JsonPropertyDescription("The population of the capital city") String population,
        @JsonPropertyDescription("The region where the capital city is located") String region,
        @JsonPropertyDescription("The primary language spoken in the capital city") String language,
        @JsonPropertyDescription("The currency used in the capital city") String currency
) {
}