package com.company.array_2d;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int[][] arr = new int[2][3];
//        int[][] arr = {{1, 1, 5, 2, 5}, {2, 3, 45, 5}, {1}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = (j * i) + (j + 1);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("[ ");
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ,");
//            }
//            System.out.println("]");
//        }
//        System.out.println(Arrays.deepToString(arr));

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(saddlePoint(arr));
    }

    public static void matrixMultiplication(int[][] A, int[][] B) {
        if (A[0].length != B.length) return;
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                int k = 0;
                int res = 0;
                while (k < B.length) {
                    res += A[i][k] * B[k][j];
                    k++;
                }
                C[i][j] = res;
            }
        }
        System.out.println(Arrays.deepToString(C));
    }

    public static List<Integer> spiralDisp(int[][] arr) {
        int count = 0, sr = 0, sc = 0, er = arr.length - 1,
                ec = arr[0].length - 1, total = arr.length * arr[0].length;
        List<Integer> ans = new ArrayList<>();
        while (count < total) {
            for (int i = sc; i <= ec && count < total; i++) {
                ans.add(arr[sr][i]);
                count++;
            }
            sr++;
            for (int i = sr; i <= er && count < total; i++) {
                ans.add(arr[i][ec]);
                count++;
            }
            ec--;
            for (int i = ec; i >= sc && count < total; i--) {
                ans.add(arr[er][i]);
                count++;
            }
            er--;
            for (int i = er; i >= sr && count < total; i--) {
                ans.add(arr[i][sc]);
                count++;
            }
            sc++;
        }
        return ans;
    }

    public static int saddlePoint(int[][] arr) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i][0], currCol = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (curr > arr[i][j]) {
                    curr = arr[i][j];
                    currCol = j;
                }
            }
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][currCol] > curr) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res = curr;
            }
        }
        return res;
    }

    public static boolean search2dMatrix(int[][] arr, int tar) {
        int r = arr.length - 1, c = 0;
        while (r >= 0 && c < arr[0].length) {
            int curr = arr[r][c];
            if (curr == tar) return true;
            else if (curr > tar) r--;
            else c++;
        }
        return false;
    }
}
