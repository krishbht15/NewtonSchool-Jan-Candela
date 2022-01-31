package com.company.time_n_space;

public class Main {
    public static void main(String[] args) {
//        int ans = gcdRec(27, 18);
//        System.out.println("saving and calling it: " + ans);
//        System.out.println("directly calling it: " + gcd(27, 18));
        System.out.println(powO(2, 10));
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
}
