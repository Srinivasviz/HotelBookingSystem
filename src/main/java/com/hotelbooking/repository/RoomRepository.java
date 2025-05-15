package com.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotelbooking.model.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    // You can add custom query methods here if needed
}
