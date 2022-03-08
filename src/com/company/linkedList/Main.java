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
        ll.pointerRev();
        ll.display();
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aSize = getSize(headA);
        int bSize = getSize(headB);
        int initialSteps = Math.abs(aSize - bSize);
        ListNode ai = headA;
        ListNode bi = headB;
        while (initialSteps > 0) {
            if (aSize > bSize) ai = ai.next;
            else bi = bi.next;
            initialSteps--;
        }
        while (ai != bi) {
            ai = ai.next;
            bi = bi.next;
        }
        return ai;
    }

    public int getSize(ListNode node) {
        int s = 0;
        while (node != null) {
            node = node.next;
            s++;
        }
        return s;
    }
}
