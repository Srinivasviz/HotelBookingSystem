package com.hotelbooking.repository;

import com.hotelbooking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hotelbooking.model.Room;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    // You can add custom query methods here if needed
}
