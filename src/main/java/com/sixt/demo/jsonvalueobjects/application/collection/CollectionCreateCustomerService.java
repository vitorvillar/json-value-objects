package com.sixt.demo.jsonvalueobjects.application.collection;

import com.sixt.demo.jsonvalueobjects.adapter.repository.SimpleCustomerRepository;
import com.sixt.demo.jsonvalueobjects.domain.simple.Address;
import com.sixt.demo.jsonvalueobjects.domain.simple.SimpleCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class CollectionCreateCustomerService {
    private final SimpleCustomerRepository simpleCustomerRepository;

    @Autowired
    public CollectionCreateCustomerService(SimpleCustomerRepository simpleCustomerRepository) {
        this.simpleCustomerRepository = simpleCustomerRepository;
    }

    public SimpleCustomer createCustomer() {
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

        var customer = new SimpleCustomer(
                UUID.randomUUID(),
                "Gudanzinho",
                "gudan@empresasturbo.com.br",
                billingAddress,
                deliveryAddress
        );

        return simpleCustomerRepository.saveAndFlush(customer);
    }
}
