package com.company.oops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Mobile iPhone = new Mobile(4, 128, "iOS",
                3000, "iPhone 12");
//        System.out.println(iPhone.name + ", " + iPhone.battery);
        Mobile galaxy = new Mobile(8, 256, "Android",
                4500, "Samsung Galaxy S20");
//        System.out.println(galaxy.name + ", " + galaxy.battery);
        iPhone.battery = 4000;
//        System.out.println(iPhone.battery);
        Mobile emptyMobile = new Mobile();
//        System.out.println(emptyMobile.storage);
        emptyMobile.OS = "NO OS";
        emptyMobile.name = "Random mobile";
        iPhone.printDetails();
        galaxy.printDetails();
        emptyMobile.printDetails();

    }
}
