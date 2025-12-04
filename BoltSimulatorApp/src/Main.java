import mediator.BoltSystem;
import models.Car;
import models.Client;
import models.Scooter;

public class Main {
    public static void main(String[] args) {
        // 1. Inițializăm Mediatorul
        BoltSystem boltApp = new BoltSystem();
        // 2. Înregistrăm vehiculele în sistem
        boltApp.registerVehicle(new Car("Car1", 10));

        boltApp.registerVehicle(new Scooter("Scooter1", 25, 20));

        boltApp.registerVehicle(new Car("Car2", 50));

        boltApp.registerVehicle(new Scooter("Scooter2", 65, 3));

        boltApp.registerVehicle(new Car("Car3", 95));

        Client client = new Client("Student", 40, boltApp);

        System.out.println("INCEPE SIMULAREA");

        client.searchForRide(5);
    }
}