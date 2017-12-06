package com.novait.booking_demo.Repositories;

import com.novait.booking_demo.Beans.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Reservation findByReservationId(Long id);
}
