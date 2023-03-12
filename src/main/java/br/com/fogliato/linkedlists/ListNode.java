package br.com.fogliato.linkedlists;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        if (DetectCycleLinkedList.detectCycle(this) != null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(val);
        ListNode aux = next;
        while (aux != null) {
            result.append(",").append(aux.val);
            aux = aux.next;
        }
        return result.toString();
    }
}
