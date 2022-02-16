package com.company.time_n_space;

public class Sorting {

    public static void main(String[] args) {
//        int[] arr = {5, 1, 3, 6, 10};
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
        int n = 10;

        something(n);
        System.out.println(n);
        StringBuilder x = new StringBuilder("I'm Old");
        somethingStringBuilder(x);
        System.out.println(x);
        String a = "new snkjnak";
        System.out.println(a.trim());
    }

    private static void somethingString(String a) {
        a.trim();
    }

    private static void somethingStringBuilder(StringBuilder x) {
        x.append("now I'm Young");
    }

    public static void something(int n) {
        n = n * 10;
        System.out.println("newr n " + n);
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

    private static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}
