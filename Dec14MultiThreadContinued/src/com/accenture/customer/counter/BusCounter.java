package com.accenture.customer.counter;


public class BusCounter {
	private int availableSeats = 3;
	
	synchronized public void bookTicket(String customerName, int numberOfSeats) {
		if(numberOfSeats<=availableSeats && numberOfSeats>0) {
			System.out.println("Hello " + customerName + ":"+numberOfSeats+" tickets are confirmed");
			availableSeats = availableSeats - numberOfSeats;
		} else {
			System.out.println("Hello " + customerName + ":"+numberOfSeats+" tickets are not available");
		}
	
	}
}
