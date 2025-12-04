package interfaces;

import models.Vehicle;
import models.Client;
import java.util.List;

public interface RideMediator {
    void registerVehicle(Vehicle vehicle);
    List<Vehicle> requestRide(Client client, int tripDistance);
}