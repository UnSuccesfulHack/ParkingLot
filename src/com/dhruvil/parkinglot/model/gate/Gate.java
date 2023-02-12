package com.dhruvil.parkinglot.model.gate;

public class Gate {
	private int gateNumber;
	private boolean isOpen;
	private boolean isClosed;
	private int assignedFloorNumber;
	
	public Gate(int gateNumber,int assignedFloorNumber,boolean isOpen,boolean isClosed) {
		this.gateNumber = gateNumber;
		this.assignedFloorNumber = assignedFloorNumber;
		this.isClosed = isClosed;
		this.isOpen = isOpen;
	}
	
	public void closeTheGate() {
		this.isClosed = true;
		this.isOpen = false;
	}
	
	public void openTheGate() {
		this.isClosed = false;
		this.isOpen  = true;
	}
	public int getGateNumber() {
		return gateNumber;
	}
	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public boolean isClosed() {
		return isClosed;
	}
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	public int getAssignedFloorNumber() {
		return assignedFloorNumber;
	}
	public void setAssignedFloorNumber(int assignedFloorNumber) {
		this.assignedFloorNumber = assignedFloorNumber;
	}
	
	

}
