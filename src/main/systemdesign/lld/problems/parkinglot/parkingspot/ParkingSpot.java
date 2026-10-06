package main.systemdesign.lld.problems.parkinglot.parkingspot;

import main.systemdesign.lld.problems.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    private long id;
    private boolean occupied;
    private Vehicle vehicle;

    public long getId() {
        return id;
    }

    public boolean isAvailable() {
        return !occupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.occupied = true;
        this.vehicle = vehicle;
    }

    public abstract boolean canFit(Vehicle vehicle);


}
