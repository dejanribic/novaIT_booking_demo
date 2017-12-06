package com.novait.booking_demo;

import com.novait.booking_demo.Beans.Room;
import com.novait.booking_demo.Beans.RoomType;
import com.novait.booking_demo.Repositories.RoomRepository;
import com.novait.booking_demo.Repositories.RoomTypeRepository;
import com.novait.booking_demo.Services.RoomService;
import com.novait.booking_demo.Services.RoomTypeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@SpringBootApplication
public class BookingDemoApplication {

	@Resource
	private RoomTypeRepository roomTypeRepository;

	@Resource
	private RoomTypeService roomTypeService;

	@Resource
	private RoomRepository roomRepository;

	@Resource
	private RoomService roomService;

	public static void main(String[] args) {
		SpringApplication.run(BookingDemoApplication.class, args);
	}

	@PostConstruct
	private void onStartUp() {
		test();
		generateRoomTypes();
		generateRooms();
	}

	private void test() {
		System.out.println("Successful app start!\n@PostConstruct method called!");
	}

	private void generateRoomTypes() {
		System.out.println("\nGenerating rooms types!");

		RoomType rt1 = new RoomType(1L, "single_bed");
		RoomType rt2 = new RoomType(2L, "double_bed");
		RoomType rt3 = new RoomType(3L, "suite");

		roomTypeRepository.save(rt1);
		roomTypeRepository.save(rt2);
		roomTypeRepository.save(rt3);

		roomTypeService.listAllRoomTypes();
	}

	private void generateRooms() {
		System.out.println("\nGenerating rooms!");

		Room r1 = new Room(1L, 1, 1L, 1L); // single_bed
		Room r2 = new Room(2L, 2, 1L, 2L); // double_bed
		Room r3 = new Room(3L, 3, 1L, 3L); // suite

		roomRepository.save(r1);
		roomRepository.save(r2);
		roomRepository.save(r3);

		roomService.listAllRooms();
	}
}

