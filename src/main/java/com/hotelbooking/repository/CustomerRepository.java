package com.hotelbooking.repository;

import com.hotelbooking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hotelbooking.model.Room;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // You can add custom query methods here if needed
}
