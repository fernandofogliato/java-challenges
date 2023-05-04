package br.com.fogliato.linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveNthNodeFromEndListTest {

    @Test
    public void case1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))));
        int n = 2;
        ListNode result = new RemoveNthNodeFromEndList().removeNthFromEnd(head,n);
        assertThat(result).hasToString("1,2,3,5");
    }

    @Test
    public void case2() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNode result = new RemoveNthNodeFromEndList().removeNthFromEnd(head,n);
        assertThat(result).isNull();
    }

    @Test
    public void case3() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;
        ListNode result = new RemoveNthNodeFromEndList().removeNthFromEnd(head,n);
        assertThat(result).hasToString("1");
    }

    @Test
    public void case4() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 2;
        ListNode result = new RemoveNthNodeFromEndList().removeNthFromEnd(head,n);
        assertThat(result).hasToString("2");
    }
}