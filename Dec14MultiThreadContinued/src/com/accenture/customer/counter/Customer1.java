package com.accenture.customer.counter;

public class Customer1 extends Thread{
	private String customerName;
	private int numberOfSeats;
	private BusCounter busCounter;
	
	 public Customer1(String customerName, int numberOfSeats, BusCounter busCounter) {
		this.customerName = customerName;
		this.numberOfSeats = numberOfSeats;
		this.busCounter=busCounter;
	}
	
	public void run() {
		busCounter.bookTicket(customerName, numberOfSeats);
	}
}
