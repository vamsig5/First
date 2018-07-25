package com.exilant.airlines.model;

import java.util.Date;



public class Form {
	private String origin;
	private String destination;
	private int numberOfPassengers;
	private String startDate;
	private String returnDate;
	private Integer selectedFlight;
	private Flight flight;
	private Customer custId;
	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public Integer getSelectedFlight() {
		return selectedFlight;
	}
	public void setSelectedFlight(Integer selectedFlight) {
		this.selectedFlight = selectedFlight;
	}
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Customer getCustId() {
		return custId;
	}
	public void setCustId(Customer custId) {
		this.custId = custId;
	}
	public Form(String origin, String destination, int numberOfPassengers, String startDate, String returnDate,
			Integer selectedFlight, Flight flight, Customer custId) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.numberOfPassengers = numberOfPassengers;
		this.startDate = startDate;
		this.returnDate = returnDate;
		this.selectedFlight = selectedFlight;
		
		this.flight = flight;
		this.custId = custId;
	}
	
	
}
