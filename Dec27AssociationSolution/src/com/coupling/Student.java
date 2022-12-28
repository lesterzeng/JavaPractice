package com.coupling;

public class Student extends Human{
	 Book book;
	 Bike bike;
	
	public void has_A(Book book) {
		this.book=book;
	}
	public void has_A(Bike bike) {
		this.bike=bike;
	}
	
}
