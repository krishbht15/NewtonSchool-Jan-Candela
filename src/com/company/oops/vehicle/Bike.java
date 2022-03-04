package com.company.oops.vehicle;

public class Bike extends Vehicle {

    int numberOfStands;
    boolean windScreen;

    public Bike(int wheels, int seater, int weight,
                int numberOfStands, boolean windScreen) {
        super(wheels, seater, weight);
        this.numberOfStands = numberOfStands;
        this.windScreen = windScreen;
    }

    public void start() {
        System.out.println("Kicking the kick.");
        super.start();
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }
}
