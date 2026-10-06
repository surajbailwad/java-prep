package main.systemdesign.lld.problems.parkinglot.parkingspot;

import main.systemdesign.lld.problems.parkinglot.vehicle.Vehicle;
import main.systemdesign.lld.problems.parkinglot.vehicle.VehicleType;

public class BikeParkingSpot extends ParkingSpot {

    @Override
    public boolean canFit(Vehicle vehicle) {
        return VehicleType.BIKE == vehicle.getVehicleType();
    }
}
