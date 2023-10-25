package br.com.fogliato.linkedlists;

// https://www.algoexpert.io/questions/sum-of-linked-lists
public class SumOfLinkedLists {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Time O(max(n, m)) | Space O(max(n,m))
    public static LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        LinkedList head = new LinkedList(0);
        LinkedList result = head;
        LinkedList node1 = linkedListOne;
        LinkedList node2 = linkedListTwo;
        int carry = 0;
        while (node1 != null || node2 != null || carry > 0) {
            int val1 = node1 != null ? node1.value : 0;
            int val2 = node2 != null ? node2.value : 0;
            int sum = val1 + val2 + carry;
            int finalVal = sum % 10; // The values should be between 0 and 9
            carry = sum / 10; // Carry the value bigger than 9 to the next iteration

            result.next = new LinkedList(finalVal);
            result = result.next;

            node1 = node1 != null ? node1.next : null;
            node2 = node2 != null ? node2.next : null;
        }
        return head.next;
    }
}
