package com.company.revisit_course;

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
        playingAroundWithLoops();
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
}
