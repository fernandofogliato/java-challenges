package br.com.fogliato.linkedlists;

import br.com.fogliato.linkedlists.MergeLinkedLists.LinkedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeLinkedListsTest {

    @Test
    void case1() {
        LinkedList headOne = new LinkedList(2);
        headOne.next = new LinkedList(6);
        headOne.next.next = new LinkedList(7);
        headOne.next.next.next = new LinkedList(8);

        LinkedList headTwo = new LinkedList(1);
        headTwo.next = new LinkedList(3);
        headTwo.next.next = new LinkedList(4);
        headTwo.next.next.next = new LinkedList(5);
        headTwo.next.next.next.next = new LinkedList(9);
        headTwo.next.next.next.next.next = new LinkedList(10);

        LinkedList merged = MergeLinkedLists.mergeLinkedLists(headOne, headTwo);
        StringBuilder sb = new StringBuilder();
        LinkedList node = merged;
        while (node != null) {
            sb.append(node.value);
            sb.append(",");
            node = node.next;
        }
        assertThat(sb.toString()).contains("1,2,3,4,5,6,7,8,9,10");
    }
}