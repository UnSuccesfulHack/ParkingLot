package com.dhruvil.parkinglot.service;

import java.util.HashMap;
import java.util.Random;

import com.dhruvil.parkinglot.model.ticket.Ticket;
import com.dhruvil.parkinglot.model.vehicle.Vehicle;
import com.dhruvil.parkinglot.parking.ParkingSpot;

public interface ITicketService {
	
	
	
	public Ticket getTicket(int parkingEntryGateNumber,ParkingSpot parkingSpot,Vehicle vehicle);
	

}
