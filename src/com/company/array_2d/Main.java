package com.company.array_2d;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[][] arr = new int[2][3];
        int[][] arr = {{1, 1, 5, 2, 5}, {2, 3, 45, 5}, {1}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = (j * i) + (j + 1);
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ,");
            }
            System.out.println("]");
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
