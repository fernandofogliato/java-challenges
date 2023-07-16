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
        LinkedList nextNode = linkedList.next;

        while (node != null) {
            if (nextNode != null && node.value == nextNode.value) {
                nextNode = nextNode.next;
                node.next = nextNode;
            } else {
                node = node.next;
                nextNode = node != null ? node.next : null;
            }
        }
        return linkedList;
    }
}
