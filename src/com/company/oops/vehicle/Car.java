package com.company.oops.vehicle;

public class Car extends Vehicle {

    String type;
    boolean hasAirBags;

    public Car(int wheels, int seater, int weight, String type, boolean hasAirBags) {
        super(wheels, seater, weight);
        this.hasAirBags = hasAirBags;
        this.type = type;
    }

    public void start() {
        System.out.println("Ignition of the engine");
        super.start();

    }

}
