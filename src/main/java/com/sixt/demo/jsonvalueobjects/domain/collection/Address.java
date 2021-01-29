package com.sixt.demo.jsonvalueobjects.domain.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Address {
    private AddressType type;
    private String street;
    private Integer houseNumber;
    private Integer postCode;
    private String city;
    private String state;
    private String country;
}
