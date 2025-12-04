package models;

public class Scooter extends Vehicle {
    private int batteryRangeKm;

    public Scooter(String id, int location, int batteryRangeKm) {
        super(id, location);
        this.batteryRangeKm = batteryRangeKm;
    }

    @Override
    public boolean canPerformTrip(int tripDistance) {
        return batteryRangeKm >= (tripDistance * 0.5);
    }

    @Override
    public String getInfoMessage(int tripDistance) {
        if (batteryRangeKm < tripDistance) {
            return "Atentie: Bateria tine doar " + batteryRangeKm + "km.";
        }
        return "Baterie suficienta (" + batteryRangeKm + "km).";
    }

    @Override
    public String toString() {
        return super.toString() + " [Bat: " + batteryRangeKm + "km]";
    }
}