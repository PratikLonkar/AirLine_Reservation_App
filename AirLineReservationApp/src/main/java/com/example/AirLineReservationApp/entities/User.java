package com.example.AirLineReservationApp.entities;

import jakarta.persistence.Entity;

@Entity
public class User extends AbstractEntity {
	
	
	private String firstName;
	private String laststName;
	private String email;
	private String password;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLaststName() {
		return laststName;
	}
	public void setLaststName(String laststName) {
		this.laststName = laststName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
