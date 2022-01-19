package com.newton_school.flow_control;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        if (n > 5) {
//            System.out.println("YES");
//        } else if (n == 5) {
//            System.out.println("MAYBE");
//        } else {
//            System.out.println("NO");
//        }
//        if (n > 10) {
//            System.out.println("Larger than 10");
//        }else{
//            System.out.println("none");
//        }
//        if (n > 20) {
//            System.out.println("Larger than 20");
//        }else{
//            System.out.println("none 2");
//        }

        switch (n) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid input");
            }
        }

    }
}
