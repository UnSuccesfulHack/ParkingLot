package com.dhruvil.parkinglot.model.vehicle;

public enum VehicleCategoryWithCost {
	
	TWOWHEELER(10),
	FOURWHEELER(25);
	
	private int fairPrice;
	
	VehicleCategoryWithCost(int price) {
		this.fairPrice = price;
	}
	
	public int getFairPrice() {
		return this.fairPrice;
	}

}
