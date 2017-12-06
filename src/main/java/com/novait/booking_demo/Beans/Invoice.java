package com.novait.booking_demo.Beans;

import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@IdClass(InvoicePK.class)
public class Invoice {

    private long invoiceId;
    private long roomId;
    private long hotelId;
    private long userId;
    private double price;

    /*
    0 - unpayed
    1 - payed
    2 - void
    */

    private int status;

    public Invoice() {
    }

    public Invoice(long invoiceId, long roomId, long hotelId, long userId, double price) {
        this.invoiceId = invoiceId;
        this.roomId = roomId;
        this.hotelId = hotelId;
        this.userId = userId;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Id
    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    @Id
    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
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
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", roomId=" + roomId +
                ", hotelId=" + hotelId +
                ", userId=" + userId +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
