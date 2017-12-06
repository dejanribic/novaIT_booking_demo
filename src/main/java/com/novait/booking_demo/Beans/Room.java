package com.novait.booking_demo.Beans;

import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@IdClass(RoomPK.class)
public class Room {

    private long roomId;
    private long number;
    private long hotelId;
    private long roomTypeId;

    public Room() {
    }

    public Room(long roomId, long number, long hotelId, long roomTypeId) {
        this.roomId = roomId;
        this.number = number;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Id
    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", number=" + number +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
