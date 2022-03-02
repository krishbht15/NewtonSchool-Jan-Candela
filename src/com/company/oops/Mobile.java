package com.company.oops;

public class Mobile {
    final int RAM;
    int storage;
    String OS;
    int battery;
    String name;

    public Mobile() {
        this.RAM = 2;
    }

    public Mobile(int RAM, int storage, String OS, int battery, String name) {
        this.RAM = RAM;
        this.storage = storage;
        this.OS = OS;
        this.battery = battery;
        this.name = name;
    }

     void printDetails() {
        System.out.println("RAM = " + RAM);
        System.out.println("storage = " + storage);
        System.out.println("OS = " + OS);
    }
}
