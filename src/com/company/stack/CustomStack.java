package com.company.stack;

import java.util.ArrayList;

public class CustomStack<T> {

    private ArrayList<T> data;

    public CustomStack() {
        this.data = new ArrayList<>();
    }

    public void push(T val) {
        data.add(val);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return this.data.remove(this.data.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return this.data.get(this.data.size() - 1);
    }

    public int size() {
        return this.data.size();
    }

    public boolean isEmpty() {
        return this.data.size() == 0;
    }
}
