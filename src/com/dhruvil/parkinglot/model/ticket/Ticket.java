package com.dhruvil.parkinglot.model.ticket;

import com.dhruvil.parkinglot.model.vehicle.Vehicle;
import com.dhruvil.parkinglot.parking.ParkingSpot;

public class Ticket {
	
	private int ticketId;
	private Vehicle vehicle;
	private long entryTime;
	private int parkingEntryGateNumber;
	private ParkingSpot parkingSpot;
	private TicketStatus ticketStatus;
	
	
	public Ticket(int ticketId, Vehicle vehicle, int parkingEntryGateNumber, ParkingSpot parkingSpot,
			TicketStatus ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.parkingEntryGateNumber = parkingEntryGateNumber;
		this.parkingSpot = parkingSpot;
		this.ticketStatus = ticketStatus;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public long getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}
	public int getParkingEntryGateNumber() {
		return parkingEntryGateNumber;
	}
	public void setParkingEntryGateNumber(int parkingEntryGateNumber) {
		this.parkingEntryGateNumber = parkingEntryGateNumber;
	}
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

}
