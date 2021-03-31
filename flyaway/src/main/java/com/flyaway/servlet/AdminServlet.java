package com.flyaway.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.hibernate.*;

public class AdminServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher wrongDispatcher = request.getRequestDispatcher("login.jsp");
		PrintWriter writer = response.getWriter();
		if(request.getParameter("username").equals(new hibernateUtil().getUsername()) && request.getParameter("password").equals(new hibernateUtil().getPassword())) {
			
			RequestDispatcher rightDiapatcher = request.getRequestDispatcher("admin.jsp"); 
			rightDiapatcher.forward(request,response); 
		} 
		else {
			wrongDispatcher.include(request, response);
			writer.println(" <h3 align=\"center\">Bad Credentials!<h3>");
		}
	}

}
