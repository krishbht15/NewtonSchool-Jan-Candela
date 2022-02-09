package com.company.revisit_course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        boolean ans = isEven(11);
//
//        System.out.println(ans);
//        boolean flag = false;
//        flag = !flag;
//        System.out.println(flag);
//        int a = 1;
//        System.out.println(a++);
//        System.out.println(++a);
        playingAroundWithArrays();
    }

    public static void playingAroundWithLoops() {
        for (int i = 0; i < 100; i++) {
            if (i != 50) {
                continue;
            }
            System.out.println(i);
        }
    }
//    public static void isEven(int n) {
//        if (n % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//            return;
//        }
//        System.out.println("random");
//    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        System.out.println("Can i visit this line?");
        return false;
    }

    public static void playingAroundWithArrays() {
        int[] a = {10, 45, 78, 32, 12};
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        int[] a = new int[size];
//        for (int i = 0; i < size; i++) {
//            a[i] = s.nextInt();
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        max(a);
    }

    public static int max(int[] arr) {
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[maxIdx] < arr[i]) {
                maxIdx = i;
            }
        }
        System.out.println("We've got the maximum element at " + maxIdx + " which is " + arr[maxIdx]);
        return maxIdx;
    }

    static void rotateArr(int arr[], int d, int n) {
        d = d % arr.length;
//        for (int i = 0; i < d; i++) {
//            rotateArray(arr);
//        }
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    public static void rotateArray(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

//    https://leetcode.com/problems/rotate-array/
}
