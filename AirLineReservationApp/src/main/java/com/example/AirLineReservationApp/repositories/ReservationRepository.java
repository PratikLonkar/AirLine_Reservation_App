package com.example.AirLineReservationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AirLineReservationApp.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	

}
