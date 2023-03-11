package br.com.fogliato.linkedlists;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
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
