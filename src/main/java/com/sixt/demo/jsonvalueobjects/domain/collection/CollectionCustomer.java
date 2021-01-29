package com.sixt.demo.jsonvalueobjects.domain.collection;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter

@Entity
@Table(name = "collection_customer")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class CollectionCustomer {
    @Id
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "addresses", nullable = false, columnDefinition = "jsonb")
    @Type(type = "jsonb")
    private Set<Address> addresses;
}
