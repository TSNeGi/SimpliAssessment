package com.flyaway.servlet;


import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.flyaway.hibernate.*;
import com.flyaway.main.Airlines;
import com.flyaway.main.Flights;

public class ListFlights extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flights> flights = new hibernateUtil().getFlights();
		PrintWriter writer = response.getWriter();
		produceHeader(writer);
		
		
		writer.print("<form action=\"admin.jsp\" method=\"post\">");
		writer.print("<h1><a href=\"admin.jsp\">Back | FlyAway</a></h1>");
		writer.println("<fieldset ");
		writer.println("<legend><h2> List Of Flights</h2></legend>");
		writer.println("</label><h2> From &emsp; To &emsp; Airline &emsp;  Fare<h3></label>");
		
		for(Flights flight : flights) {

	
			writer.println("<h3 style=\"color:#808080\">");
			writer.println( flight.getSource()+"&ensp;");
			writer.println( flight.getDestination()+"&ensp;");
			writer.println( flight.getAirline()+"&ensp;&ensp;");
			writer.println(flight.getFare());
			writer.println("</h3>");
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
