package com.accenture.customer.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ViewCustomerCarModel {
	private String username;
	private String carmodel;
	private String cartype;
	private String carRegistrationNumber;
	private String serviceRequest;
	private String status;
	private ResultSet res = null;

	public ViewCustomerCarModel(String username, String carmodel, String cartype, String carRegistrationNumber,
			String serviceRequest, String status) {
		super();
		this.username = username;
		this.carmodel = carmodel;
		this.cartype = cartype;
		this.carRegistrationNumber = carRegistrationNumber;
		this.serviceRequest = serviceRequest;
		this.status = status;
	}

	public ViewCustomerCarModel() {

	}

	public ArrayList<ViewCustomerCarModelArray> viewCustomerCarDetails() {
		try {
			// 1) Load Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			// 2) Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_car_db", "root",
					"rootroot");
			System.out.println("Connection Established Successfully");

			String s = "select * from customer_car where username=?";

			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, username);
			res = pstmt.executeQuery();
			
			ArrayList<ViewCustomerCarModelArray> al = new ArrayList<ViewCustomerCarModelArray>();
			while (res.next()) {
				username = res.getString(1);
				carmodel = res.getString(2);
				cartype = res.getString(3);
				carRegistrationNumber = res.getString(4);
				serviceRequest = res.getString(5);
				status = res.getString(6);

				al.add(new ViewCustomerCarModelArray(username, carmodel, cartype, carRegistrationNumber, serviceRequest,
						status));
			}
			return al;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
