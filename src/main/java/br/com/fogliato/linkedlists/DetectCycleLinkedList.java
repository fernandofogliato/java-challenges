package br.com.fogliato.linkedlists;

// https://leetcode.com/problems/linked-list-cycle-ii
public class DetectCycleLinkedList {

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Hare-Tortoise algorithm approach
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
