package br.com.fogliato.linkedlists;

import br.com.fogliato.linkedlists.ProgramLinkedListConstruction.DoublyLinkedList;
import br.com.fogliato.linkedlists.ProgramLinkedListConstruction.Node;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ProgramLinkedListConstructionTest {

    @Test
    public void case1() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.setHead(new Node(1));

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        doublyLinkedList.insertAfter(doublyLinkedList.head, node2);
        doublyLinkedList.insertAfter(node2, node3);
        doublyLinkedList.insertAfter(node3, node4);
        doublyLinkedList.insertAfter(node4, node5);

        doublyLinkedList.setHead(node4);
        doublyLinkedList.setTail(node6);
        doublyLinkedList.insertBefore(node6, node3);
        doublyLinkedList.insertAfter(node6, new Node(3));
        doublyLinkedList.insertAtPosition(1, new Node(3));
        doublyLinkedList.removeNodesWithValue(3);
        doublyLinkedList.remove(node2);
        Assertions.assertThat(doublyLinkedList.containsNodeWithValue(5)).isTrue();
    }

    @Test
    public void case2() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        doublyLinkedList.setHead(node1);
        doublyLinkedList.insertAfter(doublyLinkedList.head, node2);
        doublyLinkedList.insertAfter(node2, node3);
        doublyLinkedList.insertAfter(node3, node4);
        doublyLinkedList.setTail(node1);
    }

    @Test
    public void case3() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        doublyLinkedList.setHead(node1);
        doublyLinkedList.insertAfter(doublyLinkedList.head, node2);
        doublyLinkedList.insertAfter(node2, node3);
        doublyLinkedList.insertAfter(node3, node4);
        doublyLinkedList.insertAfter(node2, node1);
        doublyLinkedList.insertBefore(node3, node4);
    }
}