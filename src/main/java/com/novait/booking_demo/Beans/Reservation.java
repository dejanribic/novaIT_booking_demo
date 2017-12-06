package com.novait.booking_demo.Beans;

import javax.persistence.*;
import java.sql.Timestamp;

@SuppressWarnings("unused")
@Entity
@IdClass(ReservationPK.class)
public class Reservation {

    private long reservationId;
    private long userId;
    private long roomId;
    private long hotelId;

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
    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
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
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", userId=" + userId +
                ", roomId=" + roomId +
                ", hotelId=" + hotelId +
                ", status=" + status +
                ", creationTime=" + creationTime +
                '}';
    }
}
