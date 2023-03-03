package com.example.AirLineReservationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AirLineReservationApp.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
