package com.novait.booking_demo.Models.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("unused")
@Entity
public class RoomType {

    private Long roomTypeID;
    private String typeName;

    public RoomType() {
    }

    public RoomType(Long roomTypeID, String typeName) {
        this.roomTypeID = roomTypeID;
        this.typeName = typeName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(Long roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
