package com.dhruvil.parkinglot.model.vehicle;

public class Vehicle {
	
	private String vehicleNumber;
	private VehicleCategoryWithCost vehicleCategoryWithCost;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public VehicleCategoryWithCost getVehicleCategoryWithCost() {
		return vehicleCategoryWithCost;
	}
	public void setVehicleCategoryWithCost(VehicleCategoryWithCost vehicleCategoryWithCost) {
		this.vehicleCategoryWithCost = vehicleCategoryWithCost;
	}
	public Vehicle(String vehicleNumber, VehicleCategoryWithCost vehicleCategoryWithCost) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleCategoryWithCost = vehicleCategoryWithCost;
	}
	
	

}
