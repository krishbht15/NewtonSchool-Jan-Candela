package com.company.recursion;

public class Main {
    public static void main(String[] args) {
//        System.out.println(add(2, 5));
        printNumberSeq(5);
    }

    public static int add(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int x = add(a, b - 1);
        return a + x;
    }

    public static void printNumberSeq(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumberSeq(n - 1);
        System.out.println(n);
    }
}
