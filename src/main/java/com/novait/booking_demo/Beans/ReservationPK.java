package com.novait.booking_demo.Beans;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings({"unused", "WeakerAccess"})
public class ReservationPK implements Serializable {

    private Long reservationId;
    private Long userId;
    private Long roomId;
    private Long hotelId;

    public ReservationPK() {
    }

    @Id
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
    //@GeneratedValue(strategy = GenerationType.AUTO)
    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
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
