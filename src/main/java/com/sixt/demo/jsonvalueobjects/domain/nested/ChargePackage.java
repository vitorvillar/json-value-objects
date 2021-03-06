package com.sixt.demo.jsonvalueobjects.domain.nested;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ChargePackage {
    private String name;
    private Set<ExtendedCharge> charges;
}
