package com.flyaway.servlet;

import java.util.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.main.*;
import com.flyaway.hibernate.*;

public class FlightServlet extends HttpServlet {
		

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String source = request.getParameter("source");
			String destination = request.getParameter("destination");
			String date = request.getParameter("date");
			String numberOfPersons = request.getParameter("no_person");
			int no=Integer.parseInt(numberOfPersons);
			List<Flights> flights = new hibernateUtil().getFlights();
			PrintWriter writer = response.getWriter();
			produceHeader(writer);
			
			
			writer.print("<form action=\"home.jsp\" method=\"post\">");
			writer.print("<h1>Fly with Flyaway</h1>");
			writer.println("<fieldset> ");
			writer.println("<h2 align=\"center\"> Available Flights for");
			writer.println(date);
			writer.println( "</h2>");
			writer.println("</label><h2 align=\"center\"> From &emsp; To &emsp; Airline &emsp;  Fare<h2></label>");
			int count=0;
			for(Flights flight : flights) {
				if(source.equals(flight.getSource()) && destination.equals(flight.getDestination())) {

		
				writer.println("<h3 align=\"center\" style=\"color:#808080\">");
				writer.println( flight.getSource()+"&ensp;");
				writer.println( flight.getDestination()+"&ensp;");
				writer.println( flight.getAirline()+"&ensp;&ensp;");
				writer.println(no*flight.getFare());
				writer.println("</h3>");
				String href = "information.jsp?fare=" + no*flight.getFare()+"&source="+flight.getSource() +"&destination="+flight.getDestination() +"&date="+ date;


				writer.println("<h3 align=\"center\" ><a href=" + href + ">Book</a></h3>");
				count+=1;
			}
			}
			
			if(count==0){
					
					writer.println("<h3 align=\"center\">No Flights available now</h3>");
					}
				
				writer.println("<button type=\"submit\">Search Again</button>");
				
		writer.print("</form>");
		
		writer.println("</fieldset> ");
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
			writer.println("Available Flights");
			writer.println("</TITLE>");
			writer.println("</HEAD>");
			writer.println("<BODY>");
		}
		
	}