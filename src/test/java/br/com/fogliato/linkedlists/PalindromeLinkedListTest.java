package br.com.fogliato.linkedlists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {

    @Test
    public void case1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Assertions.assertThat(new PalindromeLinkedList().isPalindrome(head)).isTrue();
    }

    @Test
    public void case2() {
        ListNode head = new ListNode(1, new ListNode(2));
        Assertions.assertThat(new PalindromeLinkedList().isPalindrome(head)).isFalse();
    }

    @Test
    public void case3() {
        // 1 1 1 2 2 1 1
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(1)))))));
        Assertions.assertThat(new PalindromeLinkedList().isPalindrome(head)).isFalse();
    }
}