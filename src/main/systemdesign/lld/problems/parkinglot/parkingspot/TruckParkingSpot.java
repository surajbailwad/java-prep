package main.systemdesign.lld.problems.parkinglot.parkingspot;

import main.systemdesign.lld.problems.parkinglot.vehicle.Vehicle;
import main.systemdesign.lld.problems.parkinglot.vehicle.VehicleType;

public class TruckParkingSpot extends ParkingSpot {
    @Override
    public boolean canFit(Vehicle vehicle) {
        return VehicleType.TRUCK == vehicle.getVehicleType();
    }
}
