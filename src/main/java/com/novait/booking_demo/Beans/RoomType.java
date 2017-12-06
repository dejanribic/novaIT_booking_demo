package com.novait.booking_demo.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("unused")
@Entity
public class RoomType {

    private long roomTypeID;
    private String typeName;

    public RoomType() {
    }

    public RoomType(long roomTypeID, String typeName) {
        this.roomTypeID = roomTypeID;
        this.typeName = typeName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(long roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomTypeID=" + roomTypeID +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
