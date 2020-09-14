package br.com.fogliato.linkedlists;

// https://www.hackerrank.com/challenges/ctci-linked-list-cycle
public class CycleDetect {

    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static boolean hasCycle(Node head) {
        Node p = head;
        Node q = head;

        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }
}
