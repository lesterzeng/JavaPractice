package com.accenture.customer.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accenture.customer.model.CustomerDetail;
import com.accenture.customer.model.CustomerModel;


public class ViewCustomers extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerModel c = new CustomerModel();
		ArrayList<CustomerDetail> al = c.viewCustomers();
		
		HttpSession session = request.getSession(true);
		session.setAttribute("al", al);
		response.sendRedirect("ViewCustomerSuccess.jsp");
		
	}

}
