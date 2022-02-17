package com.company.time_n_space;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {45, 35, 25, 15, 55, 35, 75};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) minIdx = j;
            }
            if (i != minIdx) swap(arr, i, minIdx);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) swap(arr, j, j - 1);
                else break;
            }
        }
    }

    //    https://leetcode.com/problems/sort-colors/
    public static void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while (i <= k) {
            if (nums[i] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, k);
                k--;
            }
        }
    }
//    https://leetcode.com/problems/merge-sorted-array/

    public static int[] mergeTwoSortedArray(int[] n1, int[] n2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[n1.length + n2.length];
        while (i < n1.length && j < n2.length) {
            if (n1[i] < n2[j]) {
                ans[k] = n1[i];
                i++;
                k++;
            } else {
                ans[k] = n2[j];
                j++;
                k++;
            }
        }
        while (i < n1.length) {
            ans[k] = n1[i];
            i++;
            k++;
        }
        while (j < n2.length) {
            ans[k] = n2[j];
            j++;
            k++;
        }
        return ans;
    }
}
