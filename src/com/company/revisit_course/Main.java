package com.company.revisit_course;

import java.util.ArrayList;
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
//        playingAroundWithArrays();
//        System.out.println(isPrime(53));
//        playAroundWithAL();
        playWithRecursion();
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

    public static boolean isPrime(int n) {
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void playAroundWithAL() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        for (int i = 0; i < 10; i++) {
            list.add(5);
        }
        System.out.println(list.size());
        list.set(5, 15);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//list.get(i) is same as arr[i]
        }
        ArrayList<Integer> list2 = new ArrayList<>();

        int[] arr = {2, 1, 3, 5, 12, 2, 4, 0};
        for (int i = 0; i < arr.length; i++) {
            list2.add(arr[i]);
        }
        System.out.println(list2);
    }

    public static ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            boolean isP = isPrime(i);
            if (isP == true) {
                res.add(i);
            }
        }
        return res;
    }

    public static void playWithRecursion() {
//        printPattern(5);
        printPattern2(3);
    }

    public static void printPattern(int n) {
        if (n == 0) return;
        System.out.println(n);
        printPattern(n - 1);
        System.out.println(n);
    }

    public static void printPattern2(int n) {
        if (n == 0) return;
        System.out.println(n);
        printPattern2(n - 1);
        System.out.println(n);
        printPattern2(n - 1);
        System.out.println(n);
    }

    public static void toh(int n, char source, char helper, char dest) {
        if (n == 0) return;
        toh(n - 1, source, dest, helper);
        System.out.println("move " + n + " from " + source + " to " + dest);
        toh(n - 1, helper, source, dest);
    }
}
