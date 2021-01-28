package com.sixt.demo.jsonvalueobjects.domain;

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
public class Customer
{
    @Id
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "billing_address", nullable = false, columnDefinition = "jsonb")
    @Type(type = "jsonb")
    private Address billingAddress;

    @Column(name = "delivery_address", nullable = false, columnDefinition = "jsonb")
    @Type(type = "jsonb")
    private Address deliveryAddress;
}
