package com.dhruvil.parkinglot.service;

import java.util.ArrayList;
import java.util.List;

import com.dhruvil.parkinglot.parking.ParkingFloor;
import com.dhruvil.parkinglot.parking.ParkingSpace;

public class SystemService implements ISystemService{
	
	ParkingSpace parkingSpace;

    public SystemService(ParkingSpace parkingSpace){
        this.parkingSpace = parkingSpace;
    }

	@Override
	public ParkingFloor addParkingFloor(ParkingFloor parkingFloor) {
		List<ParkingFloor> parkingFloors = parkingSpace.getParkingFloors();
        if(parkingFloors==null){
            parkingFloors = new ArrayList<>();
        }
        parkingFloors.add(parkingFloor);
        parkingSpace.setParkingFloors(parkingFloors);
		return parkingFloor;
	}

	@Override
	public ParkingSpace removeParkingFloor(int floorNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingFloor addEnteranceGate(int floorNumber, int gateNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingFloor removeEnteranceGate(int floorNumber, int gateNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingFloor addExitGate(int floorNumber, int gateNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingFloor removeExitGate(int floorNumber, int gateNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
