package com.demoapp.cars;

interface Car {
    void drive();
}

class Golf implements Car {
    public void drive() {
        System.out.println("Conduc un golf confortabil.");
    }
}

class Lambo implements Car {
    public void drive() {
        System.out.println("Conduc un LAMBO puternic.");
    }
}

abstract class CarFactory {
    public abstract Car createCar();
}

class GolfFactory extends CarFactory {
    public Car createCar() {
        return new Golf();
    }
}

class LamboFactory extends CarFactory {
    public Car createCar() {
        return new Lambo();
    }
}

public class Main {
    public static void main(String[] args) {
        CarFactory golfFactory = new GolfFactory();
        Car golf = golfFactory.createCar();
        golf.drive();

        CarFactory lamboFactory = new LamboFactory();
        Car lambo = lamboFactory.createCar();
        lambo.drive();
    }
}
