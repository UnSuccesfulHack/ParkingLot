package com.dhruvil.parkinglot.parking;

import java.util.List;

public class ParkingSpace {
	
	private volatile List<ParkingFloor> parkingFloors;
	
	private static volatile ParkingSpace INSTANCE = null;
	
	private ParkingSpace() {
		
	}
	
	public static ParkingSpace getInstance() {
		if(INSTANCE == null) {
			return new ParkingSpace();
		}
		return INSTANCE;
	}
	
	public List<ParkingFloor> getParkingFloors() {
		return this.parkingFloors;
	}
	
	public synchronized void setParkingFloors(List<ParkingFloor> parkingFloors) {
		this.parkingFloors = parkingFloors;
	}

}
