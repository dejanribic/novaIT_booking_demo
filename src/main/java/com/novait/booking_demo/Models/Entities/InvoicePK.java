package com.novait.booking_demo.Models.Entities;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings({"unused", "WeakerAccess"})
public class InvoicePK implements Serializable {

    private Long invoiceId;
    private Long roomId;
    private Long hotelId;

    public InvoicePK() {
    }

    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoicePK invoicePK = (InvoicePK) o;

        if (invoiceId != invoicePK.invoiceId) return false;
        if (roomId != invoicePK.roomId) return false;
        return hotelId == invoicePK.hotelId;

    }

    @Override
    public int hashCode() {
        int result = (int) (invoiceId ^ (invoiceId >>> 32));
        result = 31 * result + (int) (roomId ^ (roomId >>> 32));
        result = 31 * result + (int) (hotelId ^ (hotelId >>> 32));
        return result;
    }
}
