package br.com.fogliato.linkedlists;

// https://leetcode.com/problems/middle-of-the-linked-list
public class FindMiddleLinkedList {

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
