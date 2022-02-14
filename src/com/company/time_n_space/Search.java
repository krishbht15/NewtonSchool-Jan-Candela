package com.company.time_n_space;

public class Search {


    public static int binarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) return mid;
            else if (arr[mid] < k) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRec(int[] arr, int k, int l, int r) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == k) return mid;
        else if (arr[mid] < k) return binarySearchRec(arr, k, mid + 1, r);
        else return binarySearchRec(arr, k, l, mid - 1);
    }

    public static int ternarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int partition = (r - l) / 3;
            int m1 = l + partition;
            int m2 = r - partition;
            if (arr[m1] == k) {
                return m1;
            } else if (arr[m2] == k) {
                return m2;
            } else if (k < arr[m1]) {
                r = m1 - 1;
            } else if (k > arr[m2]) {
                l = m2 + 1;
            } else {
                l = m1 + 1;
                r = m2 - 1;
            }
        }
        return -1;
    }
}
