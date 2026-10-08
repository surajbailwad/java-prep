package main.systemdesign.lld.problems.parkinglot;

import main.systemdesign.lld.problems.parkinglot.parkingspot.BikeParkingSpot;
import main.systemdesign.lld.problems.parkinglot.parkingspot.CarParkingSpot;
import main.systemdesign.lld.problems.parkinglot.parkingspot.ParkingSpot;
import main.systemdesign.lld.problems.parkinglot.parkingspot.TruckParkingSpot;
import main.systemdesign.lld.problems.parkinglot.vehicle.Bike;
import main.systemdesign.lld.problems.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    public static void exec() {
        ParkingSpot bikeParkingSpot = new BikeParkingSpot();
        ParkingSpot bikeParkingSpot2 = new BikeParkingSpot();

        ParkingSpot carParkingSpot = new CarParkingSpot();
        ParkingSpot truckParkingSpot = new TruckParkingSpot();
        List<ParkingSpot> spots = new ArrayList<>();
        spots.add(bikeParkingSpot);
        spots.add(bikeParkingSpot2);
        spots.add(carParkingSpot);
        spots.add(truckParkingSpot);
        ParkingFloor parkingFloor = new ParkingFloor(1, spots);

        ParkingLot parkingLot = ParkingLot.PARKING_LOT;
        parkingLot.addFloor(parkingFloor);

        Vehicle bike = new Bike("KA00XX0000");
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(bike);
//        parkingLot.parkVehicle(bike);

    }
}
