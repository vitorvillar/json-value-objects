package com.sixt.demo.jsonvalueobjects.adapter.handler.rest;

import com.sixt.demo.jsonvalueobjects.application.collection.CollectionCreateCustomerService;
import com.sixt.demo.jsonvalueobjects.application.collection.CollectionCustomerFinderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/collection")
public class CollectionScenarioController {
    private final CollectionCreateCustomerService collectionCreateCustomerService;
    private final CollectionCustomerFinderService collectionCustomerFinderService;

    public CollectionScenarioController(
            CollectionCreateCustomerService collectionCreateCustomerService,
            CollectionCustomerFinderService collectionCustomerFinderService
    ) {
        this.collectionCreateCustomerService = collectionCreateCustomerService;
        this.collectionCustomerFinderService = collectionCustomerFinderService;
    }

    @GetMapping("/customer/create")
    public ResponseEntity<?> createCustomer() {
        return ResponseEntity.ok(collectionCreateCustomerService.createCustomer());
    }

    @GetMapping("/customer/get/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable UUID id) {
        return ResponseEntity.ok(collectionCustomerFinderService.getCustomerById(id));
    }

    @GetMapping("/customer/all")
    public ResponseEntity<?> getAllCustomers() {
        return ResponseEntity.ok(collectionCustomerFinderService.getAllCustomers());
    }
}
