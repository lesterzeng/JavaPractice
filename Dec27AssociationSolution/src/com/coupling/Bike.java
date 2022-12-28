package com.coupling;

public class Bike {
	private String name;
	private float milage;
	public Bike(String name, float milage) {
		super();
		this.name = name;
		this.milage = milage;
	}
	public String getName() {
		return name;
	}
	public float getMilage() {
		return milage;
	}
	
}
