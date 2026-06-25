package ar.edufmass.spring7beerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonDeserialize(builder = CustomerDTO.CustomerDTOBuilder.class)
@Data
@Builder
public class CustomerDTO {
    @JsonProperty("id")
    private UUID id;

    @JsonProperty("version")
    private Integer version;

    @JsonProperty("name")
    private String name;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}