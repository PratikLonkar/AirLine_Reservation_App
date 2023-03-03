package com.example.AirLineReservationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AirLineReservationApp.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
