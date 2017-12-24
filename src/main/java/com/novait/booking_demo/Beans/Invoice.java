package com.novait.booking_demo.Beans;

import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@IdClass(InvoicePK.class)
public class Invoice {

    private Long invoiceId;
    private Long roomId;
    private Long hotelId;
    private Long userId;
    private double price;

    /*
    0 - unpayed
    1 - payed
    2 - void
    */

    private int status;

    public Invoice() {
    }

    public Invoice(Long invoiceId, Long roomId, Long hotelId, Long userId, double price) {
        this.invoiceId = invoiceId;
        this.roomId = roomId;
        this.hotelId = hotelId;
        this.userId = userId;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Id
    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    @Id
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    @Id
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
