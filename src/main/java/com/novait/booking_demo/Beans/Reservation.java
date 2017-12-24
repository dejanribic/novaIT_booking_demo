package com.novait.booking_demo.Beans;

import javax.persistence.*;
import java.sql.Timestamp;

@SuppressWarnings("unused")
@Entity
@IdClass(ReservationPK.class)
public class Reservation {

    private Long reservationId;
    private Long userId;
    private Long roomId;
    private Long hotelId;

    /*
    0 - unconfirmed
    1 - confirmed
    2 - cancelled
     */

    private Integer status;
    private Timestamp creationTime;

    public Reservation() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
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
