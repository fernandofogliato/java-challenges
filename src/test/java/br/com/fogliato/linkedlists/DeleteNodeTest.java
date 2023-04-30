package br.com.fogliato.linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteNodeTest {

    @Test
    public void case1() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5, new ListNode(1, new ListNode(9)));
        new DeleteNode().deleteNode(head.next); // 5
        assertThat(head).hasToString("4,1,9");
    }

    @Test
    public void case2() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5, new ListNode(1, new ListNode(9)));
        new DeleteNode().deleteNode(head.next.next); // 1
        assertThat(head).hasToString("4,5,9");
    }

    @Test
    public void case3() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(0, new ListNode(1, new ListNode(3)));
        new DeleteNode().deleteNode(head); // 2
        assertThat(head).hasToString("0,1,3");
    }
}