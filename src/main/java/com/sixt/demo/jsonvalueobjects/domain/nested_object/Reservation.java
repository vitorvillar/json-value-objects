package com.sixt.demo.jsonvalueobjects.domain.nested_object;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Reservation {
    @Id
    private UUID id;

    @Column(name = "charge_package", nullable = false, columnDefinition = "jsonb")
    @Type(type = "jsonb")
    private ChargePackage chargePackage;
}
