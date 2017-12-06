package com.novait.booking_demo.Beans;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings({"unused", "WeakerAccess"})
public class InvoicePK implements Serializable {

    private long invoiceId;
    private long roomId;
    private long hotelId;

    public InvoicePK() {
    }

    @Id
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
