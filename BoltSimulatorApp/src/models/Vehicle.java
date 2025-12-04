package models;

import interfaces.RideMediator;

public abstract class Vehicle {
    protected String id;
    protected int location;
    protected boolean isBusy;
    protected RideMediator mediator;

    public Vehicle(String id, int location) {
        this.id = id;
        this.location = location;
        this.isBusy = false;
    }

    public void setMediator(RideMediator mediator) {
        this.mediator = mediator;
    }

    public int getLocation() {
        return location;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public int getDistanceFrom(int targetLocation) {
        return Math.abs(this.location - targetLocation);
    }

    public abstract boolean canPerformTrip(int tripDistance);
    public abstract String getInfoMessage(int tripDistance);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + id + " (Loc: " + location + ")";
    }
}