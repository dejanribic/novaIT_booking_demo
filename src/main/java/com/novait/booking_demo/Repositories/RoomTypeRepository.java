package com.novait.booking_demo.Repositories;

import com.novait.booking_demo.Beans.RoomType;
import org.springframework.data.repository.CrudRepository;


public interface RoomTypeRepository extends CrudRepository<RoomType, Long> {
    RoomType findByTypeName(String type);
}
