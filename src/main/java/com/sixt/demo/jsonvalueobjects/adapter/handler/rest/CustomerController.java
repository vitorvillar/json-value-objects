package com.sixt.demo.jsonvalueobjects.adapter.handler.rest;

import com.sixt.demo.jsonvalueobjects.application.CreateCustomerService;
import com.sixt.demo.jsonvalueobjects.application.CustomerFinderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController
public class CustomerController
{
    private final CreateCustomerService createCustomerService;
    private final CustomerFinderService customerFinderService;

    public CustomerController(
        CreateCustomerService createCustomerService,
        CustomerFinderService customerFinderService
    ) {
        this.createCustomerService = createCustomerService;
        this.customerFinderService = customerFinderService;
    }

    @GetMapping("/customer/create")
    public ResponseEntity<?> createCustomer() {
        return ResponseEntity.ok(createCustomerService.createCustomer());
    }

    @GetMapping("/customer/get/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable UUID id) {
        return ResponseEntity.ok(customerFinderService.getCustomerById(id));
    }

    @GetMapping("/customer/all")
    public ResponseEntity<?> getAllCustomers() {
        return ResponseEntity.ok(customerFinderService.getAllCustomers());
    }
}
