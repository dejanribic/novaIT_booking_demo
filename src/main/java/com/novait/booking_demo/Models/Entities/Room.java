package com.novait.booking_demo.Models.Entities;

import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@IdClass(RoomPK.class)
public class Room {

    private Long roomId;
    private Long number;
    private Long hotelId;
    private Long roomTypeId;

    public Room() {
    }

    public Room(Long roomId, Long number, Long hotelId, Long roomTypeId) {
        this.roomId = roomId;
        this.number = number;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Id
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
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
