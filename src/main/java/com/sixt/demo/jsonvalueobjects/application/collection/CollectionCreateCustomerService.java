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
            "Zugspitzstr.",
            1,
            80000,
            "Pullach Im Isartal",
            "Bayern",
            "Deutschland"
        ));

        addresses.add(new Address(
            AddressType.DELIVERY,
        "Zugspitzstr.",
        1,
        80000,
        "Pullach Im Isartal",
        "Bayern",
        "Deutschland"
        ));

        var customer = new CollectionCustomer(
            UUID.randomUUID(),
            "Testkunde",
            "testkunde@test.com",
            addresses
        );

        return collectionCustomerRepository.saveAndFlush(customer);
    }
}
