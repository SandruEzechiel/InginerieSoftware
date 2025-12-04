package models;

import interfaces.RideMediator;
import java.util.List;

public class Client {
    private String name;
    private int location;
    private RideMediator app;

    public Client(String name, int location, RideMediator app) {
        this.name = name;
        this.location = location;
        this.app = app;
    }

    public void searchForRide(int tripDistance) {
        System.out.println("Client " + name + " (Loc " + location + ") cauta cursa de " + tripDistance + "km.");

        List<Vehicle> options = app.requestRide(this, tripDistance);

        if (options.isEmpty()) {
            System.out.println("Niciun vehicul disponibil.");
        } else {
            System.out.println("Optiuni gasite:");
            for (Vehicle v : options) {
                System.out.println(" - " + v + " | Distanta pickup: " + v.getDistanceFrom(this.location) + "km");
                System.out.println("   Status: " + v.getInfoMessage(tripDistance));
            }
        }
    }

    public int getLocation() {
        return location;
    }
}