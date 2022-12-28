package com.accenture.customer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accenture.customer.model.CustomerLoginModel;


public class CustomerLogin extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		CustomerLoginModel clogin = new CustomerLoginModel(username, password);
		int x = clogin.customerLogin();
		
		if (x==-1) {
			response.sendRedirect("/Dec22CarServiceSystemV2/invalidCustomerUsername.jsp");
		} else if (x==0) {
			response.sendRedirect("/Dec22CarServiceSystemV2/invalidCustomerPassword.jsp");
		} else {
			response.sendRedirect("/Dec22CarServiceSystemV2/customerLoginSuccess.jsp");
		}
	}

}
