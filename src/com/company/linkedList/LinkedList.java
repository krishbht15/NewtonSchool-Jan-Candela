package com.company.linkedList;

public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public Node add(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
        }
        this.size++;
        return node;
    }

    public Node remove() {
        if (this.size == 0) return null;
        else if (this.size == 1) {
            Node ans = this.head;
            this.head = null;
            this.size--;
            return ans;
        }
        int i = 0;
        Node secondLast = this.head;
        while (i < this.size - 2) {
            i++;
            secondLast = secondLast.next;
        }
        Node ans = secondLast.next;
        secondLast.next = null;
        this.size--;
        return ans;
    }

    public Node updateDataAt(int idx, int data) {
        if (idx < 0 || idx >= this.size) {
            System.out.println("Invalid index");
            return null;
        }
        int i = 0;
        Node node = this.head;
        while (i < idx) {
            i++;
            node = node.next;
        }
        node.data = data;
        return node;
    }

    public void display() {
        Node i = this.head;
        while (i != null) {
            System.out.print(i.data + " -> ");
            i = i.next;
        }
        System.out.println("Null");
    }

    public int getSize() {
        return this.size;
    }

}
