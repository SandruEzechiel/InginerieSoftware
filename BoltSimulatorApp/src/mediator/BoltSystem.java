package mediator;

import interfaces.RideMediator;
import models.Client;
import models.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BoltSystem implements RideMediator {
    private List<Vehicle> fleet = new ArrayList<>();

    @Override
    public void registerVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
        vehicle.setMediator(this);
    }

    @Override
    public List<Vehicle> requestRide(Client client, int tripDistance) {
        return fleet.stream()
                .filter(v -> !v.isBusy())
                .filter(v -> v.canPerformTrip(tripDistance))
                .sorted(Comparator.comparingInt(v -> v.getDistanceFrom(client.getLocation())))
                .limit(3)
                .collect(Collectors.toList());
    }
}