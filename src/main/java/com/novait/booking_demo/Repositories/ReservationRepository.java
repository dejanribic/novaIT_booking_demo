package com.novait.booking_demo.Repositories;

import com.novait.booking_demo.Models.Entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Reservation findByReservationId(Long id);
}
