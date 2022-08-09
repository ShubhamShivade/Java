package com.shubham.flightreservation.dao;

import com.shubham.flightreservation.model.Reservation;

public interface ReservationDao {

	Reservation bookFlight(Reservation reservation);

	Reservation checkIn(long reservationId, int noOfBags);

}
