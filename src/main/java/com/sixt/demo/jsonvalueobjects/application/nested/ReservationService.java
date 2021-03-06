package com.sixt.demo.jsonvalueobjects.application.nested;

import com.sixt.demo.jsonvalueobjects.adapter.repository.ReservationRepository;
import com.sixt.demo.jsonvalueobjects.domain.nested.ChargePackage;
import com.sixt.demo.jsonvalueobjects.domain.nested.ChargeType;
import com.sixt.demo.jsonvalueobjects.domain.nested.ExtendedCharge;
import com.sixt.demo.jsonvalueobjects.domain.nested.Reservation;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@Transactional
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation create() {
        var charge1 = new ExtendedCharge("CW", ChargeType.EXTRAS);
//        var charge2 = new ExtendedCharge("TG", ChargeType.PROTECTION);
        var chargePackage = new ChargePackage("Comfort", Set.of(charge1));
        var reservation = new Reservation(UUID.randomUUID(), chargePackage);

        return reservationRepository.saveAndFlush(reservation);
    }

    public Reservation getById(UUID id) {
        return reservationRepository.findById(id).orElseThrow();
    }

    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }
}
