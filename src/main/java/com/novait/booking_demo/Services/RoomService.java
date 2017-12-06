package com.novait.booking_demo.Services;

import com.novait.booking_demo.Beans.Room;
import com.novait.booking_demo.Beans.RoomType;
import com.novait.booking_demo.Repositories.RoomRepository;
import com.novait.booking_demo.Repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private RoomRepository roomRepository;
    private RoomTypeRepository roomTypeRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository, RoomTypeRepository roomTypeRepository) {
        this.roomRepository = roomRepository;
        this.roomTypeRepository = roomTypeRepository;
    }

    public boolean changeRoomNumber(Long id, Integer number) {
        Room r = roomRepository.findByRoomId(id);
        r.setNumber(number);
        return (roomRepository.save(r) != null);
    }

    public boolean changeRoomType(Long id, String roomType) {
        RoomType targetRoomType = roomTypeRepository.findByTypeName(roomType);
        Room roomToBeChanged = roomRepository.findByRoomId(id);
        roomToBeChanged.setRoomTypeId(targetRoomType.getRoomTypeID());
        return (roomRepository.save(roomToBeChanged) != null);
    }

    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    public void listAllRooms() {
        List<Room> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        for (Room r : rooms) {
            System.out.println(r.toString());
        }
    }
}
