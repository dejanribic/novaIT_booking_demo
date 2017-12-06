package com.novait.booking_demo.Beans;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings({"unused", "WeakerAccess"})
public class ReservationPK implements Serializable {

    private long reservationId;
    private long userId;
    private long roomId;
    private long hotelId;

    public ReservationPK() {
    }

    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
    //@GeneratedValue(strategy = GenerationType.AUTO)
    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReservationPK that = (ReservationPK) o;

        if (reservationId != that.reservationId) return false;
        if (userId != that.userId) return false;
        if (roomId != that.roomId) return false;
        return hotelId == that.hotelId;

    }

    @Override
    public int hashCode() {
        int result = (int) (reservationId ^ (reservationId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (roomId ^ (roomId >>> 32));
        result = 31 * result + (int) (hotelId ^ (hotelId >>> 32));
        return result;
    }
}
