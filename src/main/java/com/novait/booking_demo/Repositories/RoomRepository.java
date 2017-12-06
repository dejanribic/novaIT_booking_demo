package com.novait.booking_demo.Repositories;

import com.novait.booking_demo.Beans.Room;
import com.novait.booking_demo.Beans.RoomPK;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, RoomPK> {
    Room findByRoomId(Long testRoomId);
}
