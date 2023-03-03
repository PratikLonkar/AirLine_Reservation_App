package com.example.AirLineReservationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AirLineReservationApp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
