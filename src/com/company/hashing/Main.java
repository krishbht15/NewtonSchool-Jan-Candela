package com.company.hashing;

import com.company.oops.Laptop;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {10, 120, 30, 340, 40};
//        for (int val : arr) {
//            System.out.println(val);
//        }
//        String s = "Hello World";
//        Laptop laptop = new Laptop(841, 25);
//        Laptop laptop1 = laptop;
//        Laptop laptop2 = new Laptop(8, 25);
//        System.out.println(laptop.hashCode());
//        System.out.println("laptop1.hashCode() = " + laptop1.hashCode());
//        System.out.println("laptop2 = " + laptop2.hashCode());
        playAroundWithHM();

    }

    public static void playAroundWithHM() {
        CustomHM hm = new CustomHM();
        hm.put("India", 3);
        hm.put("USA", 5);
        hm.put("China", 10);
        hm.put("Australia", 1);
        hm.put("UK", 2);
        hm.display();
        hm.put("India", 9);
        System.out.println("==========================");
        hm.display();
    }
}
