package main.systemdesign.lld.problems.parkinglot;

import main.systemdesign.lld.problems.parkinglot.parkingspot.ParkingSpot;
import main.systemdesign.lld.problems.parkinglot.vehicle.Vehicle;

import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots;
    }

    public ParkingSpot findspot(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.canFit(vehicle) && spot.isAvailable()) {
                System.out.println("Found a spot");
                return spot;
            }
        }
        return null;
    }
}
