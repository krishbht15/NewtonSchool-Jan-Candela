package com.company.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
deque.removeLast()
//        playAroundQueue();
    }

    static void push_back_pb(Deque<Integer> dq, int x) {
        //Your code
        dq.addLast(x);
    }

    static void push_front_pf(Deque<Integer> dq, int x) {
        // Your code here
        dq.addFirst(x);
    }

    static void pop_back_ppb(Deque<Integer> dq) {
        // Your code here
        if (dq.isEmpty()) System.out.println(-1);
        else dq.removeLast();
    }

    static int front_dq(Deque<Integer> dq) {
        // Your code here
        if (dq.isEmpty()) return -1;
        return dq.removeFirst();
    }

    public static void playAroundQueue() {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(50);
        queue.enqueue(140);
        queue.enqueue(106);
        queue.enqueue(17);
        System.out.println(queue.remove());
        System.out.println("queue.size() = " + queue.size());
        System.out.println(queue.remove());
        System.out.println("queue.size() = " + queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println("queue.size() = " + queue.size());
    }
}
