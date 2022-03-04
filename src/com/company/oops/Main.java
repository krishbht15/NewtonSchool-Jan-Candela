package com.company.oops;

import com.company.oops.vehicle.Bike;
import com.company.oops.vehicle.Car;
import com.company.oops.vehicle.Cycle;
import com.company.oops.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://www.javatpoint.com/inheritance-in-java

public class Main {

    public static void main(String[] args) {
        march3rd();
    }

    public static void march3rd() {
        Laptop laptop = new Laptop(8, 512);
        Mobile mobile = new Mobile(8, 64, "Android", 4500, "Oneplus");
        Booting booting = new Laptop(4, 500);
//        booting.printBootingMessage();
//        laptop.printBootingMessage();
//        mobile.printBootingMessage();
//        Vehicle vehicle = new Cycle(2, 1, 30, true, true);
//        vehicle.start();
//        Cycle cycle = new Cycle(2, 1, 30, true, true);
//        cycle.start();
//        Bike bike = new Bike(2, 2, 70, 2, false);
//        bike.start();
//        Car car = new Car(4, 5, 200, "Hatchback", true);
//        System.out.println(car.wheels);
//        playWithVehicle(car);
//        System.out.println(car.wheels);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, 45));
        list.add(new Student(2, 87));
        list.add(new Student(3, 98));
        list.add(new Student(4, 15));
        list.add(new Student(5, 75));
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).marks);
        }
    }

    public static void playWithVehicle(Vehicle v) {
        v.wheels = 100;
    }

    public static void march2nd() {
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
        Mobile.mfgCountry = "ANYWHERE";
    }

    public static void poly() {
        System.out.println("I'm the first poly");
    }

    public static void poly(int a) {
        System.out.println("I'm the second poly");
    }
}
