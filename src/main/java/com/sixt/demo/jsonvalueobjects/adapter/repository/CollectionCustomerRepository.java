package com.sixt.demo.jsonvalueobjects.adapter.repository;

import com.sixt.demo.jsonvalueobjects.domain.collection.CollectionCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CollectionCustomerRepository extends JpaRepository<CollectionCustomer, UUID> {
}
