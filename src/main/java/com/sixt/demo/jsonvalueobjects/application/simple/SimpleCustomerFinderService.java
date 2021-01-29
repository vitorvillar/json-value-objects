package com.sixt.demo.jsonvalueobjects.application.simple;

import com.sixt.demo.jsonvalueobjects.adapter.repository.SimpleCustomerRepository;
import com.sixt.demo.jsonvalueobjects.domain.simple.SimpleCustomer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class SimpleCustomerFinderService {
    private final SimpleCustomerRepository simpleCustomerRepository;

    public SimpleCustomerFinderService(SimpleCustomerRepository simpleCustomerRepository) {
        this.simpleCustomerRepository = simpleCustomerRepository;
    }

    public SimpleCustomer getCustomerById(UUID id) {
        return simpleCustomerRepository.findById(id).orElseThrow();
    }

    public List<SimpleCustomer> getAllCustomers() {
        return simpleCustomerRepository.findAll();
    }
}
