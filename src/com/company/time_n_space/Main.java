package com.company.time_n_space;

public class Main {
    public static void main(String[] args) {
//        int ans = gcdRec(27, 18);
//        System.out.println("saving and calling it: " + ans);
//        System.out.println("directly calling it: " + gcd(27, 18));
//        System.out.println(powO(2, 10));
        int[] arr = {1, 2, 5, 12, 52, 76};
//        System.out.println(linearSearch(arr, 45));
//        System.out.println(linearSearchRec(arr, 12, 0));
//        testRec(0);
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return b;
    }

    public static int gcdRec(int a, int b) {
        int r = a % b;
        if (r == 0) return b;
        return gcdRec(b, r);
    }

    public static int pow(int n, int x) {
        if (x == 0) return 1;
        if (x == 1) return n;
        return n * pow(n, x - 1);
    }

    public static int powO(int n, int x) {
        if (x == 0) return 1;
        if (x == 1) return n;
        int res = powO(n, x / 2);
        res = res * res;
        if (x % 2 == 1) {
            res = res * n;
        }
        return res;
    }

    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }

    public static int linearSearchRec(int[] arr, int k, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == k) return i;
        int x = linearSearchRec(arr, k, i + 1);
        System.out.println("I'm Recursion at " + i);
        return x;
    }

    public static void testRec(int n) {
//        if (n == 100000) return;
//        System.out.println(n);
//        testRec(n + 1);
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
    }
}
