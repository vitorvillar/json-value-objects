package com.sixt.demo.jsonvalueobjects.adapter.handler.rest;

import com.sixt.demo.jsonvalueobjects.application.nested.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/nested")
public class NestedScenarioController {
    private final ReservationService reservationService;

    public NestedScenarioController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservation/create")
    public ResponseEntity<?> createReservation() {
        return ResponseEntity.ok(reservationService.create());
    }

    @GetMapping("/reservation/get/{id}")
    public ResponseEntity<?> getReservation(@PathVariable UUID id) {
        var res = reservationService.getById(id);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/reservation/all")
    public ResponseEntity<?> getAllReservations() {
        return ResponseEntity.ok(reservationService.getAll());
    }

}
