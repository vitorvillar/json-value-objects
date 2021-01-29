package com.sixt.demo.jsonvalueobjects.adapter.handler.rest;

import com.sixt.demo.jsonvalueobjects.application.simple.SimpleCreateCustomerService;
import com.sixt.demo.jsonvalueobjects.application.simple.SimpleCustomerFinderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/simple")
public class SimpleScenarioController {
    private final SimpleCreateCustomerService simpleCreateCustomerService;
    private final SimpleCustomerFinderService simpleCustomerFinderService;

    public SimpleScenarioController(
            SimpleCreateCustomerService simpleCreateCustomerService,
            SimpleCustomerFinderService simpleCustomerFinderService
    ) {
        this.simpleCreateCustomerService = simpleCreateCustomerService;
        this.simpleCustomerFinderService = simpleCustomerFinderService;
    }

    @GetMapping("/customer/create")
    public ResponseEntity<?> createCustomer() {
        return ResponseEntity.ok(simpleCreateCustomerService.createCustomer());
    }

    @GetMapping("/customer/get/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable UUID id) {
        var customer = simpleCustomerFinderService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/customer/all")
    public ResponseEntity<?> getAllCustomers() {
        return ResponseEntity.ok(simpleCustomerFinderService.getAllCustomers());
    }
}
