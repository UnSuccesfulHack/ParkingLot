package com.dhruvil.parkinglot.service;

import com.dhruvil.parkinglot.parking.ParkingFloor;
import com.dhruvil.parkinglot.parking.ParkingSpace;

public interface ISystemService {
	
	public ParkingFloor addParkingFloor(ParkingFloor parkingFloor);
	
	public ParkingSpace removeParkingFloor(int floorNumber);
	
	public ParkingFloor addEnteranceGate(int floorNumber,int gateNumber);
	
	public ParkingFloor removeEnteranceGate(int floorNumber,int gateNumber);
	
	public ParkingFloor addExitGate(int floorNumber,int gateNumber);
	
	public ParkingFloor removeExitGate(int floorNumber,int gateNumber);

}
