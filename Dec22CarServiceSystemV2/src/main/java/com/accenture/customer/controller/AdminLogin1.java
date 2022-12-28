package com.accenture.customer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accenture.customer.model.AdminModel;


public class AdminLogin1 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminUsername = request.getParameter("adminUsername");
		String adminPassword = request.getParameter("adminPassword");
		
		AdminModel a = new AdminModel(adminUsername, adminPassword);
		int x = a.adminLogin();
		
		if(x==-1) {
			response.sendRedirect("/Dec22CarServiceSystemV2/invalidUsername.jsp");
		} else if (x==0) {
			response.sendRedirect("/Dec22CarServiceSystemV2/invalidPassword.jsp");
		} else {
			response.sendRedirect("/Dec22CarServiceSystemV2/loginSuccess.jsp");
		}
	}



}
