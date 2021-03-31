package com.flyaway.servlet;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.hibernate.hibernateUtil;


public class passwordServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpassword = request.getParameter("cpassword");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("cpass.jsp");
		dispatcher.include(request, response);
		PrintWriter writer = response.getWriter();
		hibernateUtil hibernate = new hibernateUtil();
		
		hibernate.setPassword(cpassword);
		writer.println(" <h3 align=\"center\">Password Updated, you may return to the main page.<h3>");
	}

}