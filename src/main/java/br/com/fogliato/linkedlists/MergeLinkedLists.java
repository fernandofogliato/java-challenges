package br.com.fogliato.linkedlists;

public class MergeLinkedLists {

    private MergeLinkedLists() {

    }

    // This is an input class. Do not edit.
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // O(n + m) time | O(1) space - where n is the length of the first linkedlist and m is the length of the second linkedlist
    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        LinkedList p1 = headOne;
        LinkedList p2 = headTwo;
        LinkedList p1Prev = null;

        while (p1 != null && p2 != null) {
            if (p1.value < p2.value) {
                p1Prev = p1;
                p1 = p1.next;
            } else {
                if (p1Prev != null) {
                   p1Prev.next = p2;
                }
                p1Prev = p2;
                p2 = p2.next;
                p1Prev.next = p1;
            }
        }

        if (p1 == null) {
            p1Prev.next = p2;
        }
        return headOne.value < headTwo.value ? headOne : headTwo;
    }
}
