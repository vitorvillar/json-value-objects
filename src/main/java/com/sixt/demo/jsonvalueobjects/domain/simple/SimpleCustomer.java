package com.sixt.demo.jsonvalueobjects.domain.simple;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter

@Entity
@Table(name = "simple_customer")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class SimpleCustomer {
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
