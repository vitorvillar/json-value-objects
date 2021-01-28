package com.sixt.demo.jsonvalueobjects.application;

import com.sixt.demo.jsonvalueobjects.adapter.repository.CustomerRepository;
import com.sixt.demo.jsonvalueobjects.domain.Customer;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CustomerFinderService
{
    private final CustomerRepository customerRepository;

    public CustomerFinderService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(UUID id) {
        return customerRepository.findById(id).orElseThrow();
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
