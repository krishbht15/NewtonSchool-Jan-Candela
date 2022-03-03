package com.company.oops;

public class Laptop implements Booting {

    int RAM;
    int storage;

    public Laptop(int RAM, int storage) {
        this.RAM = RAM;
        this.storage = storage;
    }

    public void printBootingMessage() {
        System.out.println("Laptop is booting.");
    }
}
