package com.accenture.customer.model;

public class ViewCustomerCarModelArray {
	private String username;
	private String carmodel;
	private String cartype;
	private String carRegistrationNumber;
	private String serviceRequest;
	private String status;
	
	public ViewCustomerCarModelArray(String username, String carmodel, String cartype, String carRegistrationNumber,
			String serviceRequest, String status) {
		super();
		this.username = username;
		this.carmodel = carmodel;
		this.cartype = cartype;
		this.carRegistrationNumber = carRegistrationNumber;
		this.serviceRequest = serviceRequest;
		this.status = status;
	}
	
	public String toString() {
		return "Model: " + carmodel + " Type: " + cartype + " Registration Number: " + carRegistrationNumber + " Service Request: " + serviceRequest + " Status: " + status +"";
	}
}
