package com.company.hashing;

import com.company.oops.Laptop;

import java.util.ArrayList;
import java.util.HashMap;

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
        int[] arr = {10, 6, 3, 3};
        System.out.println(findNumberPair(arr, 2));
//        playAroundWithHM();
//        String a = new String("ss");
//        String b= new String("ss");
//        System.out.println(b.equals(a));

    }

    public static int findNumberPair(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i] % k, map.getOrDefault(arr[i] % k, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i] % k;
            if (map.get(key) > 0) {
                map.put(key, map.get(key) - 1);
            }
            count += map.getOrDefault((Math.abs(k - (arr[i] % k)) % k), 0);
        }
        return count;
    }

    public static void playAroundWithHM() {
//        GenericHashMap<String, Integer> hm = new GenericHashMap<>();
//        hm.put("India", 3);
//        hm.put("USA", 5);
//        hm.put("China", 10);
//        hm.put("Australia", 1);
//        hm.put("UK", 2);
//        hm.display();
//        hm.put("India", 9);
//        System.out.println("==========================");
//        hm.display();
//        System.out.println("hm.containsKey(\"India\") = " + hm.containsKey("India"));
//        System.out.println("hm.get(\"China\") = " + hm.get("China"));
//        System.out.println(hm.remove("China"));
//        hm.display();

        GenericHashMap<Integer, Boolean> hm = new GenericHashMap<>();
        hm.put(1, true);
        hm.put(5, false);
        hm.put(7, false);
        hm.put(9, true);
        hm.put(3, false);
        hm.put(8, true);
        hm.put(9, false);
        hm.put(2, false);
        hm.put(6, true);
        hm.display();
    }
}
