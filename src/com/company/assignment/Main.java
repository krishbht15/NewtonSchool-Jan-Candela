package com.company.assignment;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {
    public static void main(String[] args) {
//        System.out.println(modularMultiplicativeInverse(10, 17));
        System.out.println(sPrimeSeiveSagar(20));
    }

    public static int modularMultiplicativeInverse(int a, int m) {
        for (int i = 1; i < m; i++) {
            if ((a * i) % m == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int sPrime(int n) {
        int count = 0;
        for (int i = (n / 2) + 1; i <= n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int sPrimeSeiveSagar(int n) {
        boolean[] arr = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (arr[i] == false) {
                for (int j = i; j <= n; j += i) {
                    if (arr[j] == false) arr[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] == false) {
                count++;
            }
        }
        return count;
    }
}
