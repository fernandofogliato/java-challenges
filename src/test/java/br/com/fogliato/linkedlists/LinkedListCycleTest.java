package br.com.fogliato.linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleTest {

    @Test
    void case1() {
        // 3 -> 2 -> 0 -> -4 -> 2
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4, node2);

        head.next = node2;
        node2.next = node0;
        node0.next = node4;

        assertThat(new LinkedListCycle().hasCycle(head)).isTrue();
    }

    @Test
    void case2() {
        // 1 -> 2 -> 1
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2, head);
        head.next = node2;

        assertThat(new LinkedListCycle().hasCycle(head)).isTrue();
    }

    @Test
    void case3() {
        // 1
        ListNode head = new ListNode(1);
        assertThat(new LinkedListCycle().hasCycle(head)).isFalse();
    }

    @Test
    void case4() {
        assertThat(new LinkedListCycle().hasCycle(null)).isFalse();
    }
}