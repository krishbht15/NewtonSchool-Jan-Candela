package com.company.recursion;

public class Main {
    public static void main(String[] args) {
//        System.out.println(add(2, 5));
//        printNumberSeq(5);
//        System.out.println(fibRec(7));
        towerOfHanoi(3, 'A', 'B', 'C');
        System.out.println(ans);
    }

    public static int ans = 0;

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

    public static int fibRec(int n) {
        if (n == 0 || n == 1) return n;
        int b = fibRec(n - 1);
        int a = fibRec(n - 2);
        return a + b;
    }

    public static void towerOfHanoi(int n, char s, char h, char d) {
        if (n == 0) return;
        towerOfHanoi(n - 1, s, d, h);
        System.out.println(n + "- [" + s + "->" + d + "]");
        ans++;
        towerOfHanoi(n - 1, h, s, d);
    }
}
