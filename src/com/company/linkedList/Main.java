package com.company.linkedList;

public class Main {
    public static void main(String[] args) {
        playingAroundWithLL();
    }

    public static void playingAroundWithLL() {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.display();
        ll.add(20);
        ll.display();
        ll.add(30);
        ll.display();
        ll.add(40);
        ll.display();
        ll.add(50);
        ll.display();
        ll.updateDataAt(0, 100);
        ll.display();
        ll.remove();
        ll.display();
        ll.remove();
        ll.display();
        ll.remove();
        ll.display();
        ll.remove();
        ll.display();
        ll.remove();
        ll.display();
        ll.remove();
        ll.display();

    }
}
