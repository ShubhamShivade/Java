package com.shubham.flightreservation.test;

import com.shubham.flightreservation.dao.ReservationDao;
import com.shubham.flightreservation.dao.ReservationDaoImpl;
import com.shubham.flightreservation.model.Passenger;
import com.shubham.flightreservation.model.Reservation;

public class Test {

	public static void main(String[] args) {
		ReservationDao dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("Veer");
		passenger.setLastName("Raheja");
		passenger.setEmail("veer@raheja.com");
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);

		Reservation savedReservation = dao.bookFlight(reservation);
		System.out.println(savedReservation);

		Reservation checkedInReservation = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkedInReservation);
	}

}
