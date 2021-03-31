package com.flyaway.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Flights {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FLIGHT_ID")
	private int id;
	
	@Column(name="Source", nullable = false)
	private String source;
	
	@Column(name="Destination", nullable = false)
	private String destination;
	
	@Column(name="Distance", nullable = false)
	private String distance;
	
	@Column(name="Airline", nullable = false)
	private String airline;
	
	@Column(name="Fare", nullable = false)
	private int fare;
	
	
	
	
	
	
	
	public Flights(int id, String source, String destination, String distance, String airline, int fare) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.airline = airline;
		this.fare = fare;
	}
	
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}




	public Flights() {
		super();
	}

	
	@Override
	public String toString() {
		return "Flights [id=" + id + ", source=" + source + ", destination=" + destination + ", distance=" + distance
				+ ", airline=" + airline + ", fare=" + fare + "]";
	}


	
	
	

	

	
}
