package com.company.array;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] a = new int[5];
//        System.out.println(a[2]);
//        a[2] = 3;
//        System.out.println(a[2]);
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i * 17;
//            System.out.println(a[i]);
//        }
//        for (int i = 0; i < 5; i++){
//            System.out.println(a[i]);
//        }

//        int[] arr = {45, 85, 53, 87, 10, 2, 45, 78, 65};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = s.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter the " + i + "th element: ");
//            arr[i] = s.nextInt();
//        }
//        System.out.print("Enter the value to find: ");
//        int el = s.nextInt();
//        checkPrime(el);
//        System.out.println(max(arr));
//        System.out.println(findElement(arr, el));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }
//        int[] arr = {0, 1, 0, 1, 0, 1, 1};
//        sort01(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }
//        System.out.println(isPrimeOptimized(198756145));
//        System.out.println(divisors(49));
        System.out.println(reverseANumber(987654));
    }

    public static int max(int[] a) {
//        int maxRes = Integer.MIN_VALUE;
        int maxRes = a[0];
        System.out.println(maxRes);
        for (int i = 0; i < a.length; i++) {
            if (maxRes < a[i]) {
                maxRes = a[i];
            }
        }
        return maxRes;
    }

    public static int findElement(int[] a, int el) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public static void checkPrime(int n) {
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        int loopTill = (n / 2) - 1;
        for (int i = 2; i <= loopTill; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }

    public static void sort01(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isPrimeOptimized(int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int divisors(int n) {
        int count = 2;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int reverseANumber(int n) {
        int res = 0;
        while (n > 0) {
            int last = n % 10;
            res = res * 10 + last;
            n = n / 10;
        }
        return res;
    }
//    https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-two-arrays2408/1/
}
