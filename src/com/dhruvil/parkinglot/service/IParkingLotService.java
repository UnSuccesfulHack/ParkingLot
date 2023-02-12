package com.dhruvil.parkinglot.service;

import com.dhruvil.parkinglot.model.ticket.Ticket;
import com.dhruvil.parkinglot.model.vehicle.Vehicle;

public interface IParkingLotService {
	
	public Ticket bookParking(int parkingEntryGateNumber,Vehicle vehicle);
	
	public void freeParking(Ticket ticket);

}
