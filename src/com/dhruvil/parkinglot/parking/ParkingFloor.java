package com.dhruvil.parkinglot.parking;

import java.util.List;

import com.dhruvil.parkinglot.model.gate.ParkingEntryGate;
import com.dhruvil.parkinglot.model.gate.ParkingExitGate;

public class ParkingFloor {
	
	public ParkingFloor(List<ParkingSpot> parkingSpots, int floorNumber, List<ParkingEntryGate> parkingEntryGates,
			List<ParkingExitGate> parkingExitGates) {
		super();
		this.parkingSpots = parkingSpots;
		this.floorNumber = floorNumber;
		this.parkingEntryGates = parkingEntryGates;
		this.parkingExitGates = parkingExitGates;
	}
	
	private List<ParkingSpot> parkingSpots;
	private int floorNumber;
	private List<ParkingEntryGate> parkingEntryGates;
    private List<ParkingExitGate> parkingExitGates;
    
	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public List<ParkingEntryGate> getParkingEntryGates() {
		return parkingEntryGates;
	}
	public void setParkingEntryGates(List<ParkingEntryGate> parkingEntryGates) {
		this.parkingEntryGates = parkingEntryGates;
	}
	public List<ParkingExitGate> getParkingExitGates() {
		return parkingExitGates;
	}
	public void setParkingExitGates(List<ParkingExitGate> parkingExitGates) {
		this.parkingExitGates = parkingExitGates;
	}

}
