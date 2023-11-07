package br.com.fogliato.linkedlists;

import br.com.fogliato.linkedlists.RemoveKthNodeFromEndList.LinkedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveKthNodeFromEndListTest {

    @Test
    public void case1() {
        LinkedList head = new LinkedList(0);
        head.next = new LinkedList(1);
        head.next.next = new LinkedList(2);
        head.next.next.next = new LinkedList(3);
        head.next.next.next.next = new LinkedList(4);
        head.next.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next.next = new LinkedList(6);
        head.next.next.next.next.next.next.next = new LinkedList(7);
        head.next.next.next.next.next.next.next.next = new LinkedList(8);
        head.next.next.next.next.next.next.next.next.next = new LinkedList(9);

        int k = 4;

        // It should remove the node 6
        RemoveKthNodeFromEndList.removeKthNodeFromEnd(head, k);

        assertThat(head.value).isEqualTo(0);
        assertThat(head.next.value).isEqualTo(1);
        assertThat(head.next.next.value).isEqualTo(2);
        assertThat(head.next.next.next.value).isEqualTo(3);
        assertThat(head.next.next.next.next.value).isEqualTo(4);
        assertThat(head.next.next.next.next.next.value).isEqualTo(5);
        assertThat(head.next.next.next.next.next.next.value).isEqualTo(7);
        assertThat(head.next.next.next.next.next.next.next.value).isEqualTo(8);
        assertThat(head.next.next.next.next.next.next.next.next.value).isEqualTo(9);
    }
}