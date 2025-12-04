package models;

public class Car extends Vehicle {

    public Car(String id, int location) {
        super(id, location);
    }

    @Override
    public boolean canPerformTrip(int tripDistance) {
        return true;
    }

    @Override
    public String getInfoMessage(int tripDistance) {
        return "Car ready.";
    }
}