package com.flyaway.servlet;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.flyaway.hibernate.*;
import com.flyaway.main.Airlines;

public class ListAirlines extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Airlines> airlines = new hibernateUtil().getAirlines();
		PrintWriter writer = response.getWriter();
		produceHeader(writer);
		
		
		writer.print("<form action=\"admin.jsp\" method=\"post\">");
		writer.print("<h1><a href=\"admin.jsp\">Back | FlyAway</a></h1>");
		writer.println("<fieldset ");
		writer.println("<legend><h2> List Of Airlines</h2></legend>");
		writer.println("<label align=\"center\">");
		writer.println("</label>");
		
		for(Airlines airline : airlines) {

			writer.println("<label align=\"center\">");
			writer.println("<h3>");
			writer.println( airline.getName());
			writer.println("</h3>");
			writer.println("</label>");
		}
		
		writer.println("</fieldset>");
		writer.println("<button type=\"submit\">Back to Admin Page</button>");
		produceFooter(writer);
	}
	
	private static void produceFooter(PrintWriter writer) {
		writer.println("</BODY>");
		writer.println("</HTML>");
	}
	
	private static void produceHeader(PrintWriter writer) {
		writer.println("<!DOCTYPE html>");
		writer.println("<HTML>");
		writer.println("<HEAD>");
		writer.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />");
		writer.println("<TITLE>");
		writer.println("List of Airlines");
		writer.println("</TITLE>");
		writer.println("</HEAD>");
		writer.println("<BODY>");
	}

}