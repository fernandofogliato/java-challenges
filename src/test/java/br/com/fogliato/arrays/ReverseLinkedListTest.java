package br.com.fogliato.arrays;

import br.com.fogliato.linkedlists.ListNode;
import br.com.fogliato.linkedlists.ReverseLinkedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseLinkedListTest {

    @Test
    void case1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = ReverseLinkedList.reverseList(head);
        assertThat(result.toString()).hasToString("5,4,3,2,1");
    }

    @Test
    void case2() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = ReverseLinkedList.reverseList(head);
        assertThat(result.toString()).hasToString("2,1");
    }

    @Test
    void case3() {
        ListNode result = ReverseLinkedList.reverseList(null);
        assertThat(result).isNull();
    }
}
