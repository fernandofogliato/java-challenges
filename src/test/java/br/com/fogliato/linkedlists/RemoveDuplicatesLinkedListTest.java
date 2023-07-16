package br.com.fogliato.linkedlists;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// https://www.algoexpert.io/questions/remove-duplicates-from-linked-list
class RemoveDuplicatesLinkedListTest {

    @Test
    public void case1() {
        RemoveDuplicatesLinkedList.LinkedList list = new RemoveDuplicatesLinkedList.LinkedList(1);
        list.next = new RemoveDuplicatesLinkedList.LinkedList(1);
        list.next.next = new RemoveDuplicatesLinkedList.LinkedList(3);
        list.next.next.next = new RemoveDuplicatesLinkedList.LinkedList(4);
        list.next.next.next.next = new RemoveDuplicatesLinkedList.LinkedList(4);
        list.next.next.next.next.next = new RemoveDuplicatesLinkedList.LinkedList(4);
        list.next.next.next.next.next.next = new RemoveDuplicatesLinkedList.LinkedList(5);
        list.next.next.next.next.next.next.next = new RemoveDuplicatesLinkedList.LinkedList(6);
        list.next.next.next.next.next.next.next.next = new RemoveDuplicatesLinkedList.LinkedList(6);

        assertThat(new RemoveDuplicatesLinkedList().removeDuplicatesFromLinkedList(list)).hasToString("1->3->4->5->6");
    }
}