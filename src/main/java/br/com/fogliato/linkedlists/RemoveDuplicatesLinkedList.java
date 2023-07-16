package br.com.fogliato.linkedlists;

public class RemoveDuplicatesLinkedList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            LinkedList node = this;
            while (node != null) {
                sb.append(node.value);
                node = node.next;
                if (node != null) {
                    sb.append("->");
                }
            }
            return sb.toString();
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList node = linkedList;
        LinkedList nextDistinctNode = linkedList.next;

        while (node != null) {
            if (nextDistinctNode != null && node.value == nextDistinctNode.value) {
                nextDistinctNode = nextDistinctNode.next;
                node.next = nextDistinctNode;
            } else {
                node = node.next;
                nextDistinctNode = node != null ? node.next : null;
            }
        }
        return linkedList;
    }
}
