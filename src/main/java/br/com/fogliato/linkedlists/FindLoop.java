package br.com.fogliato.linkedlists;

// https://www.algoexpert.io/questions/find-loop
public class FindLoop {

    private FindLoop() {

    }

    // O(n) time | O(1) space - where n is the number of nodes of the linked list
    public static LinkedList findLoop(LinkedList head) {
        LinkedList slow = head.next;
        LinkedList fast = head.next.next;

        // Find the loop
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reset the slow pointer to the head, so it can find the node that originates the loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
