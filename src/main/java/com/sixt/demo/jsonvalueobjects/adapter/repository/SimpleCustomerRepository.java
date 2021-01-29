package com.sixt.demo.jsonvalueobjects.adapter.repository;

import com.sixt.demo.jsonvalueobjects.domain.simple.SimpleCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SimpleCustomerRepository extends JpaRepository<SimpleCustomer, UUID> {
}
