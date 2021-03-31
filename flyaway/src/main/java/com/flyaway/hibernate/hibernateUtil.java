package com.flyaway.hibernate;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.flyaway.main.Admin;
import com.flyaway.main.Airlines;
import com.flyaway.main.Flights;



public class hibernateUtil {
	
	
	public String getUsername() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Admin> query = session.createQuery("from Admin");
		Admin admin = query.list().get(0);

		session.getTransaction().commit();
		session.close();

		return admin.getUsername();
	}
	

	public String getPassword() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Admin> query = session.createQuery("from Admin");
		Admin admin = query.list().get(0);

		session.getTransaction().commit();
		session.close();

		return admin.getPassword();
	}

	public String setPassword(String password) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Admin admin = session.get(Admin.class, 1);
		admin.setPassword(password);

		session.getTransaction().commit();
		session.close();

		return admin.getPassword();
	}

	
	public List<Airlines> getAirlines() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Airlines> query = session.createQuery("from Airlines");
		List<Airlines> airlines = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return airlines;
	}
	
	
	public boolean checkAirline(String airlineName) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Airlines> query = session.createQuery("from Airlines");
		List<Airlines> airlines = query.list();
		
		for(Airlines airline: airlines) {
			if(airline.getName().equals(airlineName)) {
				return true;
			}
		}
		
		session.getTransaction().commit();
		session.close();
		
		return false;
	}
	
	public List<Flights> getFlights() {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Flights> query = session.createQuery("from Flights");
		List<Flights> flights = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return flights;
	}
	
	

	public List<Flights> getFlightsBetween(String source, String destination) {
		Session session = createSessionFactory().openSession();

		session.beginTransaction();

		Query<Flights> query = session.createQuery("from Flights");
		
		List<Flights> flights = new ArrayList<Flights>();
		for(Flights flight : query.list()) {
			if(flight.getSource().equals(source) && flight.getDestination().equals(destination)) {
				flights.add(flight);
			}
		}
		
		session.getTransaction().commit();
		session.close();
		
		return flights;
	}
	
	private SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.flyaway.main.Admin.class);
		configuration.addAnnotatedClass(com.flyaway.main.Airlines.class);
		configuration.addAnnotatedClass(com.flyaway.main.Flights.class);

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());

		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		return factory;
	}


}
