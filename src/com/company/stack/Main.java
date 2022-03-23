package com.company.stack;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(Arrays.toString(prevGreaterElement(arr)));
        System.out.println(largestHistogram(arr));
    }

    public static void playingAroundWithStack() {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((top == '(' && curr == ')') ||
                        (top == '[' && curr == ']') ||
                        (top == '{' && curr == '}')) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int ci = 1;
        int[] res = new int[arr.length];
        while (ci < arr.length) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[ci]) {
                res[stack.pop()] = arr[ci];
            }
            stack.push(ci);
            ci++;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }

    public static int[] nextSmallestElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int ci = 1;
        int[] res = new int[arr.length];
        while (ci < arr.length) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[ci]) {
                res[stack.pop()] = ci;
            }
            stack.push(ci);
            ci++;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = arr.length;
        }
        return res;
    }

    public static int[] prevGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        int ci = arr.length - 2;
        int[] res = new int[arr.length];
        while (ci >= 0) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[ci]) {
                res[stack.pop()] = arr[ci];
            }
            stack.push(ci);
            ci--;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }

    public static int[] prevSmallestElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        int ci = arr.length - 2;
        int[] res = new int[arr.length];
        while (ci >= 0) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[ci]) {
                res[stack.pop()] = ci;
            }
            stack.push(ci);
            ci--;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }

    public static int largestHistogram(int[] arr) {
        int[] lsi = prevSmallestElement(arr);
        int[] rsi = nextSmallestElement(arr);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int area = (rsi[i] - lsi[i] - 1) * arr[i];
            max = Math.max(max, area);
        }
        return max;
    }

    public static int[] stockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        int ci = arr.length - 2;
        int[] res = new int[arr.length];
        while (ci >= 0) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[ci]) {
                int temp = stack.pop();
                res[temp] = temp - ci;
            }
            stack.push(ci);
            ci--;
        }
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            res[curr] = curr + 1;
        }
        return res;
    }

    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> min;

        public MinStack() {
            this.stack = new Stack<>();
            this.min = new Stack<>();
        }

        public void push(int val) {
            if (min.isEmpty() || min.peek() > val) min.push(val);
            stack.push(val);
        }

        public void pop() {
            int val = stack.pop();
            if (val == min.peek()) min.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            if (min.isEmpty()) return -1;
            return min.peek();
        }
    }
}
