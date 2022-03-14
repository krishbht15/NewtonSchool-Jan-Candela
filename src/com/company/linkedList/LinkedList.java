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

    public Node getAt(int idx) {
        if (idx < 0 || idx >= size) return null;
        int i = 0;
        Node node = this.head;
        while (i < idx) {
            i++;
            node = node.next;
        }
        return node;
    }

    public void dataReverse() {
        int i = 0;
        while (i < size / 2) {
            Node l = getAt(i);
            Node r = getAt(size - 1 - i);
            int temp = l.data;
            l.data = r.data;
            r.data = temp;
            i++;
        }
    }

    public void pointerRev() {
        Node p = null;
        Node c = this.head;
        while (c != null) {
            Node n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        this.head = p;
    }

    public Node getMid() {
        Node s = head;
        Node f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
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

    public Node makeCircular() {
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = head;
        return head;
    }

    public int check(Node head) {
        Node temp = head.next;
        while (temp != null) {
            if (temp == head) return 1;
            temp = temp.next;
        }
        return 0;
    }


    public Node insertionCircularLL(Node head, int K) {
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        Node newNode = new Node(K);
        temp.next = newNode;
        newNode.next = head;
        return head;
    }
}
