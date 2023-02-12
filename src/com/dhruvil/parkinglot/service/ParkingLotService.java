package com.dhruvil.parkinglot.service;

import com.dhruvil.parkinglot.model.gate.ParkingEntryGate;
import com.dhruvil.parkinglot.model.ticket.Ticket;
import com.dhruvil.parkinglot.model.vehicle.Vehicle;
import com.dhruvil.parkinglot.parking.ParkingFloor;
import com.dhruvil.parkinglot.parking.ParkingSpace;
import com.dhruvil.parkinglot.parking.ParkingSpot;

public class ParkingLotService implements IParkingLotService{
	
	private ParkingSpace parkingSpace;
	private TicketService ticketService;
	
	public ParkingLotService(ParkingSpace parkingSpace,TicketService ticketService) {
		this.parkingSpace = parkingSpace;
		this.ticketService = ticketService;
	}

	@Override
	public Ticket bookParking(int parkingEntryGateNumber, Vehicle vehicle) {
		
		ParkingSpot parkingSpot = null;
		boolean parkingFound = false;
		
		for(int floor = 0; floor < parkingSpace.getParkingFloors().size(); floor++) {
			ParkingFloor parkingFloor = parkingSpace.getParkingFloors().get(floor);
			for(int gate = 0; gate < parkingFloor.getParkingEntryGates().size(); gate++) {
				ParkingEntryGate entryGate = parkingFloor.getParkingEntryGates().get(gate);
				if(entryGate.getGateNumber() == parkingEntryGateNumber && entryGate.isOpen()) {
					for(int j = 0; j < parkingFloor.getParkingSpots().size(); j++) {
						parkingSpot = parkingFloor.getParkingSpots().get(j);
						if(parkingSpot.isSpaceAvailableForParking() && parkingSpot.getVehicleCategoryWithCost() == vehicle.getVehicleCategoryWithCost()) {
							parkingSpot.setVehicle(vehicle);
							parkingSpot.setSpaceAvailableForParking(false);
							parkingFound = true;
							break;
						}
					}
					if(parkingFound) break;
				}
			}
			if(parkingFound) break;
		}
		return ticketService.getTicket(parkingEntryGateNumber, parkingSpot, vehicle);
	}

	@Override
	public void freeParking(Ticket ticket) {
		// TODO Auto-generated method stub
		int parkingEntryGateNumber = ticket.getParkingEntryGateNumber();
		ParkingSpot parkingSpotToDelete = ticket.getParkingSpot();
		boolean parkingFreed = false;
		
		for(int floor = 0; floor < parkingSpace.getParkingFloors().size();floor++) {
			ParkingFloor parkingFloor = parkingSpace.getParkingFloors().get(floor);
			for(int gate = 0; gate < parkingFloor.getParkingEntryGates().size(); gate++) {
				ParkingEntryGate entryGate = parkingFloor.getParkingEntryGates().get(gate);
				if(entryGate.getGateNumber() == parkingEntryGateNumber) {
					for(int j = 0; j < parkingFloor.getParkingSpots().size(); j++) {
						ParkingSpot parkingSpot = parkingFloor.getParkingSpots().get(j);
						if(parkingSpot.getSpotNumber() == parkingSpotToDelete.getSpotNumber()) {
							parkingSpot.setVehicle(null);
							parkingSpot.setSpaceAvailableForParking(true);
							parkingFreed = true;
							break;
						}
					}
					if(parkingFreed) break;
				}
			}
			if(parkingFreed) break;
		}
		
	}

}
