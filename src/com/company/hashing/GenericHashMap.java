package com.company.hashing;

import java.util.LinkedList;

public class GenericHashMap<K, V> {

    class GenericNode {
        K key;
        V value;

        public GenericNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<GenericNode>[] bucket;
    private int size;

    public GenericHashMap() {
        this.size = 0;
        initialise(4);
    }

    public void put(K key, V val) {
        int bi = getBucketIndex(key);
        for (GenericNode node : bucket[bi]) {
            if (node.key.equals(key)) {
                node.value = val;
                return;
            }
        }
        GenericNode node = new GenericNode(key, val);
        bucket[bi].addLast(node);
        this.size++;
        if (getLambda() <= 2.0) return;
        rehashing();
    }

    private void rehashing() {
        LinkedList<GenericNode>[] old = this.bucket;
        initialise(this.bucket.length * 2);
        for (LinkedList<GenericNode> ll : old) {
            for (GenericNode node : ll) {
                put(node.key, node.value);
            }
        }
    }

    public V get(K key) {
        int bi = getBucketIndex(key);
        for (GenericNode node : this.bucket[bi]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int bi = getBucketIndex(key);
        for (GenericNode node : this.bucket[bi]) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public V remove(K key) {
        int bi = getBucketIndex(key);
        for (GenericNode node : this.bucket[bi]) {
            if (node.key.equals(key)) {
                V ans = node.value;
                bucket[bi].remove(node);
                this.size--;
                return ans;
            }
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        for (LinkedList<GenericNode> ll : this.bucket) {
            for (GenericNode node : ll) {
                System.out.println(node.key + " = " + node.value);
            }
        }
    }

    private double getLambda() {
        return this.size * (1.0 / this.bucket.length);
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % bucket.length);
    }

    private void initialise(int cap) {
        this.bucket = new LinkedList[cap];
        for (int i = 0; i < cap; i++) {
            this.bucket[i] = new LinkedList<>();
        }
    }
}
