package com.company.oops;

public class Mobile implements Booting {
    final int RAM;
    int storage;
    String OS;
    int battery;
    String name;

    static String mfgCountry = "India";

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
        System.out.println("mfgCountry = " + mfgCountry);
    }

    static void usageOfMobile() {
        System.out.println("Mobile is used to connect with" +
                " other people");
    }

    public void printBootingMessage() {
        System.out.println("Mobile is booting.");
    }
}
