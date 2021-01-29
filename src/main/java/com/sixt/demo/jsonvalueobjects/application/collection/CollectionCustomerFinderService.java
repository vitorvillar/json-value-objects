package com.sixt.demo.jsonvalueobjects.application.collection;

import com.sixt.demo.jsonvalueobjects.adapter.repository.CollectionCustomerRepository;
import com.sixt.demo.jsonvalueobjects.domain.collection.CollectionCustomer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CollectionCustomerFinderService {
    private final CollectionCustomerRepository collectionCustomerRepository;

    public CollectionCustomerFinderService(CollectionCustomerRepository collectionCustomerRepository) {
        this.collectionCustomerRepository = collectionCustomerRepository;
    }

    public CollectionCustomer getCustomerById(UUID id) {
        return collectionCustomerRepository.findById(id).orElseThrow();
    }

    public List<CollectionCustomer> getAllCustomers() {
        return collectionCustomerRepository.findAll();
    }
}
