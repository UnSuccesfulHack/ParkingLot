package com.dhruvil.parkinglot.service;

import java.util.HashMap;
import java.util.Random;

import com.dhruvil.parkinglot.model.ticket.Ticket;
import com.dhruvil.parkinglot.model.ticket.TicketStatus;
import com.dhruvil.parkinglot.model.vehicle.Vehicle;
import com.dhruvil.parkinglot.parking.ParkingSpot;

public class TicketService implements ITicketService {
	
	HashMap<String,Ticket> ticketMap = new HashMap<String,Ticket>();

	@Override
	public Ticket getTicket(int parkingEntryGateNumber, ParkingSpot parkingSpot, Vehicle vehicle) {
		{
	        Ticket ticket = new Ticket(new Random().nextInt(), vehicle, parkingEntryGateNumber, parkingSpot, TicketStatus.BOOKED);
	        ticketMap.put(vehicle.getVehicleNumber(), ticket);
	        return ticket;
		}	
	}
	
	public HashMap<String,Ticket> getTicketMap() {
		return this.ticketMap;
	}

}
