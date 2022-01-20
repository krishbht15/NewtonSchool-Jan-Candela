package com.company.loops_functions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i <= 10; ++i) {
//            System.out.println(2 + " * " + i + " = " + (2 * i));
//        }
//        int x = 1;
//        System.out.println(++x);
//        System.out.println(x);

//        int i=1;
//        while(i<=10){
//            System.out.println(2 + " * " + i + " = " + (2 * i));
//            i++;
//        }

//        int i=0;
//        do{
//            System.out.println(2 + " * " + i + " = " + (2 * i++));
//        }while (i<=10);
//        System.out.println(i);

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String st = s.next();
        calculator(a, b, st);


    }

    public static void calculator(int x, int y, String z) {
        System.out.println("called calculator");
        switch (z) {
            case "+": {
                System.out.println(add(x, y));
                break;
            }
            case "-": {
                System.out.println(sub(x, y));
                break;
            }
            case "table": {
                table(x, y);
                break;
            }
            default: {
                System.out.println("Invalid input");
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void table(int a, int b) {
        for (int i = b; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
