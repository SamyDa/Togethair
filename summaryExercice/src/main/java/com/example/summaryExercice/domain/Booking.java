package com.example.summaryExercice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private int id;
	private Flight flight;
	private double price;
	private int nrTickets;
	private Customer customer;
	private boolean paymentStatus;
	
	
	public Booking(Flight flight, double price, int nrTickets, Customer customer, boolean paymentStatus) {
		super();
		this.flight = flight;
		this.price = price;
		this.nrTickets = nrTickets;
		this.customer = customer;
		this.paymentStatus = paymentStatus;
	}
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNrTickets() {
		return nrTickets;
	}
	public void setNrTickets(int nrTickets) {
		this.nrTickets = nrTickets;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
	
	
}
