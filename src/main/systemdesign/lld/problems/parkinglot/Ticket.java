package main.systemdesign.lld.problems.parkinglot;

import main.systemdesign.lld.problems.parkinglot.parkingspot.ParkingSpot;
import main.systemdesign.lld.problems.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {

    private final String id;
    private final Vehicle vehicle;
    private final LocalDateTime entryTime;
    private final ParkingSpot spot;

    public Ticket(String id, Vehicle vehicle, ParkingSpot spot) {
        this.id = id;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
        this.spot = spot;
    }

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }
}
