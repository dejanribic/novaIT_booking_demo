package com.novait.booking_demo.Services;

import com.novait.booking_demo.Beans.Invoice;
import com.novait.booking_demo.Beans.Reservation;
import com.novait.booking_demo.Repositories.InvoiceRepository;
import com.novait.booking_demo.Repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@Service
public class ReservationService {

    private ReservationRepository reservationRepository;
    private InvoiceRepository invoiceRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, InvoiceRepository invoiceRepository) {
        this.reservationRepository = reservationRepository;
        this.invoiceRepository = invoiceRepository;
    }

    public List<Reservation> getAllReservations() {
        List<Reservation> reservations = new ArrayList<>();
        reservationRepository.findAll().forEach(reservations::add);
        return reservations;
    }

    public void createNewReservation(Reservation res) {
        if (res.getCreationTime() == null) {
            res.setCreationTime(new Timestamp(System.currentTimeMillis()));
        }
        res.setStatus(0);
        if (reservationRepository.save(res) != null) {
            Invoice invoice = new Invoice();
            invoice.setHotelId(res.getHotelId());
            invoice.setStatus(0);
            invoice.setPrice(20.00); //
            invoice.setRoomId(res.getRoomId());
            invoice.setUserId(res.getUserId());

            invoiceRepository.save(invoice);
        }
    }

    public void listAllReservations() {
        List<Reservation> reservations = new ArrayList<>();
        reservationRepository.findAll().forEach(reservations::add);
        for (Reservation res : reservations) {
            System.out.println(res.toString());
        }
    }

    public void updateStatus(Integer status, Long id) {
        Reservation resToChange = reservationRepository.findByReservationId(id);
        resToChange.setStatus(status);
        reservationRepository.save(resToChange);
    }
}
