package com.example.AirLineReservationApp.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;



@Entity
public class Flight extends AbstractEntity {
	
	private String flightNumber;
	private String operatingAirLine;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirLine() {
		return operatingAirLine;
	}
	public void setOperatingAirLine(String operatingAirLine) {
		this.operatingAirLine = operatingAirLine;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	private Timestamp estimatedDepartureTime;;

}
