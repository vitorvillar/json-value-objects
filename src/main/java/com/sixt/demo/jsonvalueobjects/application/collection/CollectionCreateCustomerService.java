package com.sixt.demo.jsonvalueobjects.application.collection;

import com.sixt.demo.jsonvalueobjects.adapter.repository.CollectionCustomerRepository;
import com.sixt.demo.jsonvalueobjects.domain.collection.Address;
import com.sixt.demo.jsonvalueobjects.domain.collection.AddressType;
import com.sixt.demo.jsonvalueobjects.domain.collection.CollectionCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.UUID;

@Service
@Transactional
public class CollectionCreateCustomerService {
    private final CollectionCustomerRepository collectionCustomerRepository;

    @Autowired
    public CollectionCreateCustomerService(CollectionCustomerRepository collectionCustomerRepository) {
        this.collectionCustomerRepository = collectionCustomerRepository;
    }

    public CollectionCustomer createCustomer() {
        var addresses = new HashSet<Address>();
        addresses.add(new Address(
            AddressType.BILLING,
            "Rua do Turbo",
            1,
            80000,
            "Turbolandia",
            "Sao Turbo",
            "HUE HUE BR"
        ));

        addresses.add(new Address(
            AddressType.DELIVERY,
            "Rua do Turbo",
            1,
            80000,
            "Turbolandia",
            "Sao Turbo",
            "HUE HUE BR"
        ));

        var customer = new CollectionCustomer(
            UUID.randomUUID(),
            "Gudanzinho",
            "gudan@empresasturbo.com.br",
            addresses
        );

        return collectionCustomerRepository.saveAndFlush(customer);
    }
}
