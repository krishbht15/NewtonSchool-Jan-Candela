package com.company.hashing;

import java.util.LinkedList;

public class CustomHM {

    class HMNode {
        String key;
        Integer value;

        public HMNode(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HMNode>[] bucket;
    private int size;

    public CustomHM() {
        initialise(4);
        this.size = 0;
    }

    public void put(String key, Integer val) {
        int bi = getBucketIndex(key);
        for (HMNode node : bucket[bi]) {
            if (node.key.equals(key)) {
                node.value = val;
                return;
            }
        }
        HMNode node = new HMNode(key, val);
        bucket[bi].addLast(node);
        this.size++;
        if (getLambda() <= 2.0) return;
        rehashing();
    }

    private void rehashing() {
        LinkedList<HMNode>[] old = this.bucket;
        initialise(this.bucket.length * 2);
        for (LinkedList<HMNode> ll : old) {
            for (HMNode node : ll) {
                put(node.key, node.value);
            }
        }
    }

    public void display() {
        for (LinkedList<HMNode> ll : this.bucket) {
            for (HMNode node : ll) {
                System.out.println(node.key + " = " + node.value);
            }
        }
    }

    private double getLambda() {
        return this.size * (1.0 / this.bucket.length);
    }

    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode() % bucket.length);
    }

    private void initialise(int cap) {
        this.bucket = new LinkedList[cap];
        for (int i = 0; i < cap; i++) {
            this.bucket[i] = new LinkedList<HMNode>();
        }
    }
}
