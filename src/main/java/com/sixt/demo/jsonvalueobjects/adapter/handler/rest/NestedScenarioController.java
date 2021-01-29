package com.sixt.demo.jsonvalueobjects.adapter.handler.rest;

import com.sixt.demo.jsonvalueobjects.application.nested.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class NestedScenarioController {
    private final ReservationService reservationService;

    public NestedScenarioController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservation/create")
    public ResponseEntity<?> createReservation() {
        return ResponseEntity.ok(reservationService.create());
    }

    @GetMapping("/reservation/{id}")
    public ResponseEntity<?> getReservation(@PathVariable UUID id) {
        return ResponseEntity.ok(reservationService.getById(id));
    }

    @GetMapping("/reservation/all")
    public ResponseEntity<?> getAllReservations() {
        return ResponseEntity.ok(reservationService.getAll());
    }

}