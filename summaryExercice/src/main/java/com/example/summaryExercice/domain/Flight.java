package com.example.summaryExercice.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Flight {
	@Id
	@GeneratedValue
	private long id;
	private Location departure;
	private Location arrival;
	private LocalDate departureDateAndTime;
	private LocalDate arrivalDateAndTime;
	private int nrOfpassenger;
	@OneToMany
	private List<Booking> booking;
	public Flight(Location departure, Location arrival, LocalDate departureDateAndTime, LocalDate arrivalDateAndTime,
			int nrOfpassenger, List<Booking> booking) {
		super();
		this.departure = departure;
		this.arrival = arrival;
		this.departureDateAndTime = departureDateAndTime;
		this.arrivalDateAndTime = arrivalDateAndTime;
		this.nrOfpassenger = nrOfpassenger;
		this.booking = booking;
	}
	public Location getDeparture() {
		return departure;
	}
	public void setDeparture(Location departure) {
		this.departure = departure;
	}
	public Location getArrival() {
		return arrival;
	}
	public void setArrival(Location arrival) {
		this.arrival = arrival;
	}
	public LocalDate getDepartureDateAndTime() {
		return departureDateAndTime;
	}
	public void setDepartureDateAndTime(LocalDate departureDateAndTime) {
		this.departureDateAndTime = departureDateAndTime;
	}
	public LocalDate getArrivalDateAndTime() {
		return arrivalDateAndTime;
	}
	public void setArrivalDateAndTime(LocalDate arrivalDateAndTime) {
		this.arrivalDateAndTime = arrivalDateAndTime;
	}
	public int getNrOfpassenger() {
		return nrOfpassenger;
	}
	public void setNrOfpassenger(int nrOfpassenger) {
		this.nrOfpassenger = nrOfpassenger;
	}
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	
	
	
	
	
	
}
