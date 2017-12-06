package com.novait.booking_demo.Beans;

import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings("unused")
public class RoomPK implements Serializable{

    private long roomId;
    private long hotelId;

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
