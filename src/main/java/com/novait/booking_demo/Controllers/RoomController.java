package com.novait.booking_demo.Controllers;

import java.util.List;

import com.novait.booking_demo.Models.Entities.Room;
import com.novait.booking_demo.Models.Entities.RoomType;
import com.novait.booking_demo.Services.RoomService;
import com.novait.booking_demo.Services.RoomTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    private final Logger logger = LoggerFactory.getLogger(RoomController.class);

    private final RoomService roomService;
    private final RoomTypeService roomTypeService;

    @Autowired
    public RoomController(RoomService roomService, RoomTypeService roomTypeService) {
        this.roomService = roomService;
        this.roomTypeService = roomTypeService;
    }

    @RequestMapping("/rooms")
    public List<Room> getAllRooms() {
        logger.info("\nTest: getting all rooms!!\t");
        return roomService.getAllRooms();
    }

    @RequestMapping("/roomtypes")
    public List<RoomType> getAllRoomTypes() {
        return roomTypeService.getAllRoomTypes();
    }

    @RequestMapping("/rooms/{id}")
    public Room getRoom(@PathVariable Long id) {
        return roomService.getRoom(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/rooms/numberChange/{id}")
    public Room updateRoomNumber(@RequestBody Long number, @PathVariable Long id) {
        roomService.changeRoomNumber(id, number);
        return roomService.getRoom(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/rooms/typeChange/{id}")
    public Room updateRoomType(@RequestBody String roomType, @PathVariable Long id) {
        roomService.changeRoomType(id, roomType);
        return roomService.getRoom(id);
    }
}
