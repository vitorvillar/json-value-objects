package com.sixt.demo.jsonvalueobjects.domain.simple;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Address {
    private String street;
    private Integer houseNumber;

    @JsonProperty("postCode")
    private Integer zipCode;

    private String city;
    private String state;
    private String country;
    private String addressComplement;

    @JsonIgnore
    private Integer postboxNumber;
}
