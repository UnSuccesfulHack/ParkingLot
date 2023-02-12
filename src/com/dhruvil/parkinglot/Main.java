package com.dhruvil.parkinglot;

import java.util.ArrayList;
import java.util.List;

import com.dhruvil.parkinglot.model.gate.ParkingEntryGate;
import com.dhruvil.parkinglot.model.gate.ParkingExitGate;
import com.dhruvil.parkinglot.model.ticket.Ticket;
import com.dhruvil.parkinglot.model.vehicle.TwoWheelerVehicle;
import com.dhruvil.parkinglot.model.vehicle.Vehicle;
import com.dhruvil.parkinglot.model.vehicle.VehicleCategoryWithCost;
import com.dhruvil.parkinglot.parking.ParkingFloor;
import com.dhruvil.parkinglot.parking.ParkingSpace;
import com.dhruvil.parkinglot.parking.ParkingSpot;
import com.dhruvil.parkinglot.service.ParkingLotService;
import com.dhruvil.parkinglot.service.SystemService;
import com.dhruvil.parkinglot.service.TicketService;

public class Main {
	public static void main(String[] args) 
	{
		
		/*
		 * Requirements :- 
		 * 1. One entry and One exit -> but need to make sure it is scalable for more.
		 * 2. Different types of parking spots - four wheeler , two wheeler etc.
		 * 3. Payment - Hourly based/ Minute based charge.
		 * 4. Floors - For simplicity assume 1 floor.
		 * 
		 * 
		 * 
		 * Objects :- 
		 * 
		 * 1. Vehicle :- Number, Type (ENUM)
		 * 2. Ticket :- EntryTime , ParkingSPOT . 
		 * 3. EnteranceGate :- FindParkingSpace , UpdateParkingspace , generateTicket. 
		 * 4. ParkingSpot :- Id , Vehicle , isEmpty , Type , price
		 * 5. ExitGate :- Cost calculation , payment , updateParkingSpot.
		 */
		ParkingSpace parkingSpace = ParkingSpace.getInstance();
		TicketService ticketService = new TicketService();
        ParkingLotService parkingService = new ParkingLotService(parkingSpace, ticketService);
        SystemService systemService = new SystemService(parkingSpace);
        
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new ParkingSpot(1, VehicleCategoryWithCost.TWOWHEELER, true));
        parkingSpots.add(new ParkingSpot(2, VehicleCategoryWithCost.TWOWHEELER, true));
        parkingSpots.add(new ParkingSpot(4, VehicleCategoryWithCost.FOURWHEELER, true));

        List<ParkingEntryGate> parkingEntryGates = new ArrayList<>();
        parkingEntryGates.add(new ParkingEntryGate(1, 1, true, false));
        
        List<ParkingExitGate> parkingExitGates = new ArrayList<>();
        parkingExitGates.add(new ParkingExitGate(1, 2, false, false));
        
        ParkingFloor parkingFloor = new ParkingFloor(parkingSpots,1, parkingEntryGates, parkingExitGates);
        
        systemService.addParkingFloor(parkingFloor);
        
        Vehicle omVehicle =
                new TwoWheelerVehicle(
                        "Dl12 CR");

        Vehicle ramVehicle =
                new TwoWheelerVehicle(
                        "Dl14 CR");
        
        Ticket omTicket = parkingService.bookParking(1, omVehicle);
        Ticket ramTicket = parkingService.bookParking(1, ramVehicle);
        
        System.out.println(ticketService.getTicketMap());
        
        System.out.println(omTicket.getParkingSpot().getSpotNumber() + " "+ omTicket.getVehicle().getVehicleNumber());
        
        System.out.println(ramTicket.getParkingSpot().getSpotNumber() + " "+ ramTicket.getVehicle().getVehicleNumber());
        
        parkingService.freeParking(omTicket);
        
        System.out.println(ticketService.getTicketMap());
        
        /*
         * ParkingSpot - Number , Type , Vehicle , row ,isOccupied . 
         * Methods :- setVehicle , getVehicle , setRow, getRow, setNumber,getNumber, setType, getType , CanFit(Vehicle) ,setIsOccupied() , getIsOccupied() 
         * Vehicle (parent) -> NumberPlate , VehicleCategory
         * ParkingLot - List<ParkingSlot>  AllParkingSpots , OccupiedSpots , EmptySpots. 
         * 
         * 
         */
        
        
        
        /*
         * Board - Cells , List<Snake> List<Ladder> 
         * Dice - diceCount , rollDice() 
         * Jump(Parent) - Snake , Ladder (child) 
         * Player - ID
         * Cell - 
         */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}
}
