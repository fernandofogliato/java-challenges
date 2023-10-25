package br.com.fogliato.linkedlists;

import br.com.fogliato.linkedlists.SumOfLinkedLists.LinkedList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfLinkedListsTest {

    @Test
    public void case1() {
        LinkedList linkedList1 = new LinkedList(2);
        linkedList1.next = new LinkedList(4);
        linkedList1.next.next = new LinkedList(7);
        linkedList1.next.next.next = new LinkedList(1);

        LinkedList linkedList2 = new LinkedList(9);
        linkedList2.next = new LinkedList(4);
        linkedList2.next.next = new LinkedList(5);

        LinkedList result = SumOfLinkedLists.sumOfLinkedLists(linkedList1, linkedList2);
        Assertions.assertThat(result.value).isEqualTo(1);
        Assertions.assertThat(result.next.value).isEqualTo(9);
        Assertions.assertThat(result.next.next.value).isEqualTo(2);
        Assertions.assertThat(result.next.next.next.value).isEqualTo(2);
    }
}