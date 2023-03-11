package br.com.fogliato.linkedlists;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sorted = new ListNode(-1);
        ListNode cur = sorted;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;
        return sorted.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = mergeTwoLists(list1, list2);
        System.out.print(result.val);
        ListNode aux = result.next;
        while (aux != null) {
            System.out.print(aux.val);
            aux = aux.next;
        }
    }
}
