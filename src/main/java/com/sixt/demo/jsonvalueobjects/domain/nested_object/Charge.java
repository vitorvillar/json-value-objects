package com.sixt.demo.jsonvalueobjects.domain.nested_object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Charge {
    private String code;
    private ChargeType type;
}
