package br.com.fogliato.linkedlists;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
public class RemoveNthNodeFromEndList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int totalNodes = 0;
        while (node != null) {
            totalNodes++;
            node = node.next;
        }

        if (totalNodes == 1) {
            return null;
        }

        node = head;
        int i = n == 1 ? 1 : 0;
        while (node != null) {
            if (i == totalNodes - n) {
                if (n == 1) {
                    node.next = null;
                    return head;
                }
                node.val = node.next.val;
                node.next = node.next.next;
            }
            node = node.next;
            i++;
        }

        return head;
    }
}
