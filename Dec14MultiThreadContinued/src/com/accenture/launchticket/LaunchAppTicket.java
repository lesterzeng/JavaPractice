package com.accenture.launchticket;

import com.accenture.customer.counter.BusCounter;
import com.accenture.customer.counter.Customer1;

public class LaunchAppTicket {


	public static void main(String[] args) {
		
		BusCounter bc = new BusCounter();
		
		Customer1 c1 = new Customer1("Ramu", 2, bc);
		Customer1 c2 = new Customer1("Raju", 2, bc);
		
		c1.start();
		c2.start();
	}

}
