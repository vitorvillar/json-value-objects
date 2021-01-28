package com.sixt.demo.jsonvalueobjects.application;

import com.sixt.demo.jsonvalueobjects.adapter.repository.CustomerRepository;
import com.sixt.demo.jsonvalueobjects.domain.Address;
import com.sixt.demo.jsonvalueobjects.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class CreateCustomerService
{
    private final CustomerRepository customerRepository;

    @Autowired
    public CreateCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer() {
        var billingAddress = new Address(
            "Rua do Turbo",
            1,
            80000,
            "Turbolandia",
            "Sao Turbo",
            "HUE HUE BR"
        );
        var deliveryAddress = new Address(
            "Rua do Turbo",
            1,
            80000,
            "Turbolandia",
            "Sao Turbo",
            "HUE HUE BR"
        );

        var customer = new Customer(
            UUID.randomUUID(),
            "Gudanzinho",
            "gudan@empresasturbo.com.br",
            billingAddress,
            deliveryAddress
        );

        return customerRepository.saveAndFlush(customer);
    }
}
