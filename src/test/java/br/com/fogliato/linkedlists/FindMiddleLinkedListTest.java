package br.com.fogliato.linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindMiddleLinkedListTest {

    @Test
    void case1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = FindMiddleLinkedList.middleNode(head);
        assertThat(result.toString()).hasToString("3,4,5");
    }

    @Test
    void case2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = FindMiddleLinkedList.middleNode(head);
        assertThat(result.toString()).hasToString("4,5,6");
    }

    @Test
    void case3() {
        ListNode result = FindMiddleLinkedList.middleNode(null);
        assertThat(result).isNull();
    }
}
