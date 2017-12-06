package com.novait.booking_demo.Services;

import com.novait.booking_demo.Beans.RoomType;
import com.novait.booking_demo.Repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomTypeService {

    private RoomTypeRepository roomTypeRepository;

    @Autowired
    public RoomTypeService(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    public List<RoomType> getAllRoomTypes() {
        List<RoomType> roomTypes = new ArrayList<>();
        roomTypeRepository.findAll().forEach(roomTypes::add);
        return roomTypes;
    }

    public void listAllRoomTypes() {
        List<RoomType> roomTypes = new ArrayList<>();
        roomTypeRepository.findAll().forEach(roomTypes::add);
        for (RoomType rt : roomTypes) {
            System.out.println(rt.toString());
        }
    }
}
