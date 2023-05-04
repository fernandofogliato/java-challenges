package br.com.fogliato.linkedlists;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/
public class PalindromeLinkedList {

    ListNode findMiddle(ListNode head) {
        ListNode t = head;
        ListNode h = head;

        if (h.next != null && h.next.next != null) {
            h = h.next.next;
            t = t.next;
        }
        return t;
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode secondHalf = reverse(middle.next);

        ListNode start = head;
        while (secondHalf != null && start!=null) {
            if (start.val != secondHalf.val) {
                return false;
            }
            start = start.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}
