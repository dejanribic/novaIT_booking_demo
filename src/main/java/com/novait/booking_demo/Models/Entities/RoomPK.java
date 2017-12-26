package com.novait.booking_demo.Models.Entities;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings("unused")
public class RoomPK implements Serializable{

    private Long roomId;
    private Long hotelId;

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

        RoomPK roomPK = (RoomPK) o;

        if (roomId != roomPK.roomId) return false;
        return hotelId == roomPK.hotelId;

    }

    @Override
    public int hashCode() {
        int result = (int) (roomId ^ (roomId >>> 32));
        result = 31 * result + (int) (hotelId ^ (hotelId >>> 32));
        return result;
    }
}
