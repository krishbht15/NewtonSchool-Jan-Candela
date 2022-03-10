package com.company.linkedList;

public class DoublyLL {

    Node head;
    int size;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public DoublyLL() {
        this.size = 0;
    }

    public Node insertFirst(int k) {
        Node node = new Node(k);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        this.size++;
        return head;
    }

    //Indexing starts from 1.
    public Node insertAt(int K, int P) {
        if (P == 1) return insertFirst(K);
        Node node = new Node(K);
        Node temp = head;
        while (P > 1) {
            temp = temp.next;
            P--;
        }
        Node prev = temp.prev;
        node.next = temp;
        node.prev = temp.prev;
        prev.next = node;
        temp.prev = node;
        return head;
    }

    public Node findKthFromLast(Node head, int k) {
        Node s = head;
        Node f = head;
        while (k > 1) {
            f = f.next;
            k--;
        }
        while (f.next != null) {
            s = s.next;
            f = f.next;
        }
        return s;
    }

    public void deletion(Node node) {
        Node p = node.prev;
        Node n = node.next;
        if (p != null) p.next = n;
        if (n != null) n.prev = p;
    }

    public Node deletionKthFromLast(Node head, int k) {
        Node node = findKthFromLast(head, k);
        Node next = head.next;
        deletion(node);
        return node == head ? next : node;
    }

    public Node reverse(Node head) {
        Node prev = head.prev;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
