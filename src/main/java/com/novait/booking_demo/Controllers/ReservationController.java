package com.novait.booking_demo.Controllers;


import com.novait.booking_demo.Beans.Reservation;
import com.novait.booking_demo.Services.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {

    private final Logger logger = LoggerFactory.getLogger(ReservationController.class);

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping("/reservations")
    public List<Reservation> getAllReservations() {
        logger.info("\nTest: getting all reservations!\t");
        return reservationService.getAllReservations();
    }


    @RequestMapping(method = RequestMethod.POST, value ="/reservations")
    public Reservation addReservation(@RequestBody Reservation res) {
        reservationService.createNewReservation(res);
        return res;
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/reservations/{id}")
    public Reservation updateReservationStatus(@RequestBody Integer status, @PathVariable Long id) {
        reservationService.updateStatus(status, id);
        return reservationService.getReservation(id);
    }

}
