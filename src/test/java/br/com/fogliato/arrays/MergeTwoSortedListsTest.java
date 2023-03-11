package br.com.fogliato.arrays;

import br.com.fogliato.linkedlists.ListNode;
import br.com.fogliato.linkedlists.MergeTwoSortedLists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeTwoSortedListsTest {

    @Test
    void case1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertThat(result.toString()).isEqualTo("1,1,2,3,4,4");
    }

    @Test
    void case2() {
        ListNode result = MergeTwoSortedLists.mergeTwoLists(null, null);
        assertThat(result).isNull();
    }

    @Test
    void case3() {
        ListNode list2 = new ListNode(0);

        ListNode result = MergeTwoSortedLists.mergeTwoLists(null, list2);
        assertThat(result.toString()).isEqualTo("0");
    }
}
