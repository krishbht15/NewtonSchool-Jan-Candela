package com.company.queue;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> data;
    private int size;
    private int front;

    public Queue() {
        this.data = new ArrayList<>();
        this.size = 0;
        this.front = 0;
    }

    public void enqueue(int val) {
        data.add(val);
        this.size++;
    }

    public int remove() {
        if (this.size == 0) return -1;
        int ans =/* data.remove(0)*/ this.data.get(this.front);
        this.front++;
        this.size--;
        return ans;
    }

    public int peek() {
        if (this.size == 0) return -1;
        return data.get(this.front);
    }

    public int size() {
        return this.size;
    }
}
