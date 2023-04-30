package br.com.fogliato.linkedlists;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
public class DeleteNode {

    public void deleteNode(ListNode node) {
        ListNode aux = node;
        aux.val = aux.next.val;
        aux.next = aux.next.next;
    }
}
