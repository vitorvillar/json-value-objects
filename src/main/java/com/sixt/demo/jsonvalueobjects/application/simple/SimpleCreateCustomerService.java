package com.sixt.demo.jsonvalueobjects.application.simple;

import com.sixt.demo.jsonvalueobjects.adapter.repository.SimpleCustomerRepository;
import com.sixt.demo.jsonvalueobjects.domain.simple.Address;
import com.sixt.demo.jsonvalueobjects.domain.simple.SimpleCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class SimpleCreateCustomerService {
    private final SimpleCustomerRepository simpleCustomerRepository;

    @Autowired
    public SimpleCreateCustomerService(SimpleCustomerRepository simpleCustomerRepository) {
        this.simpleCustomerRepository = simpleCustomerRepository;
    }

    public SimpleCustomer createCustomer() {
        var billingAddress = new Address(
            "Zugspitzstr.",
            1,
            80000,
            "Pullach Im Isartal",
            "Bayern",
            "Deutschland",
            null,
            1
        );
        var deliveryAddress = new Address(
            "Zugspitzstr.",
            1,
            80000,
            "Pullach Im Isartal",
            "Bayern",
            "Deutschland",
            null,
            1
        );

        var customer = new SimpleCustomer(
            UUID.randomUUID(),
            "Testkunde",
            "testkunde@test.com",
            billingAddress,
            deliveryAddress
        );

        return simpleCustomerRepository.saveAndFlush(customer);
    }
}
