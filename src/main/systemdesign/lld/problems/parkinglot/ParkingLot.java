package main.systemdesign.lld.problems.parkinglot;

import main.systemdesign.lld.problems.parkinglot.parkingspot.ParkingSpot;
import main.systemdesign.lld.problems.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public enum ParkingLot {
    PARKING_LOT;

    private final List<ParkingFloor> parkingFloors = new ArrayList<>();

    public void addFloor(ParkingFloor parkingFloor) {
        parkingFloors.add(parkingFloor);
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : parkingFloors) {
            ParkingSpot spot = floor.findspot(vehicle);
            if (spot != null && spot.isAvailable() && spot.canFit(vehicle)) {
                System.out.println("Spot available");
                spot.parkVehicle(vehicle);
                return new Ticket(UUID.randomUUID().toString(), vehicle, spot);
            }
        }
        throw new RuntimeException("Parking Full");

    }


}
