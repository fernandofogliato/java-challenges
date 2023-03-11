package br.com.fogliato.linkedlists;

// https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
