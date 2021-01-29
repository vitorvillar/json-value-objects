package com.sixt.demo.jsonvalueobjects.adapter.repository;

import com.sixt.demo.jsonvalueobjects.domain.nested.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservationRepository extends JpaRepository<Reservation, UUID> {
}
