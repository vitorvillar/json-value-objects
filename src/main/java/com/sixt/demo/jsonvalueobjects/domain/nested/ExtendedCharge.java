package com.sixt.demo.jsonvalueobjects.domain.nested;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ExtendedCharge {
    private String chargeCode;
    private ChargeType chargeType;
}
