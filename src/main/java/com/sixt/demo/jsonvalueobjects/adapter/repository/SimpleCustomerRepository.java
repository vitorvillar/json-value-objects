package com.sixt.demo.jsonvalueobjects.adapter.repository;

import com.sixt.demo.jsonvalueobjects.domain.simple.SimpleCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SimpleCustomerRepository extends JpaRepository<SimpleCustomer, UUID> {
    @Query(value = "select * from simple_customer where billing_address ->> 'street' ilike %:street%", nativeQuery = true)
    List<SimpleCustomer> findAllCustomersByStreet(@Param("street") String street);
}
