package com.hotelbooking.model;

import com.hotelbooking.model.Customer;
import com.hotelbooking.model.Room;
import jakarta.persistence.*;
import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id @GeneratedValue
    private int bookingId;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Customer customer;

    private LocalDate checkIn;
    private LocalDate checkOut;
    private String status; // Booked / Cancelled
}
