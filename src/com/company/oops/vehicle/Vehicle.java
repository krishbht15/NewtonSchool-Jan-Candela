package com.company.oops.vehicle;

public class Vehicle {

    int wheels;
    int seater;
    int weight;

    public Vehicle(int wheels, int seater, int weight) {
        this.wheels = wheels;
        this.seater = seater;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Vehicle is going to start.....");
    }
}
