package com.accenture.customer.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accenture.customer.model.ViewCustomerCarModel;
import com.accenture.customer.model.ViewCustomerCarModelArray;


public class ViewCustomerCar extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ViewCustomerCarModel c = new ViewCustomerCarModel();
		ArrayList<ViewCustomerCarModelArray> al = c.viewCustomerCarDetails();
		
		HttpSession session  = request.getSession(true);
		session.setAttribute("al", al);
		response.sendRedirect("customerLoginSuccess.jsp");
		
		
	}

}
