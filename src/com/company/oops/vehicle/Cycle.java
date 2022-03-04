package com.company.oops.vehicle;

public class Cycle extends Vehicle {

    boolean hasGears;
    boolean mudGuard;

    public Cycle(int wheels, int seater, int weight,
                 boolean hasGears, boolean mudGuard) {
        super(wheels, seater, weight);
        this.hasGears = hasGears;
        this.mudGuard = mudGuard;
    }

    public void start() {
        System.out.println("Paddling the paddles.");
        super.start();
    }

    public void stop() {
        System.out.println("Cycle is stopping");
    }
}
