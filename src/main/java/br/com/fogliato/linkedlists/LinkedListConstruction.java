package br.com.fogliato.linkedlists;

// https://www.algoexpert.io/questions/linked-list-construction
class ProgramLinkedListConstruction {

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node node = head;
            while (node != null) {
                sb.append(node.value);
                if (node.next != null) {
                    sb.append("<->");
                }
                node = node.next;
            }
            return sb.toString();
        }

        public void setHead(Node node) {
            if (head == null) {
                head = node;
                tail = node;
                return;
            }
            insertBefore(head, node);
        }

        private void movePointersExistingNode(Node node) {
            if (node.prev != null) {
                node.prev.next = node.next;
            }

            if (node.next != null) {
                node.next.prev = node.prev;
            }
            node.next = null;
            node.prev = null;
        }

        public void setTail(Node node) {
            if (tail == null) {
                head = node;
                tail = node;
                return;
            }
            insertAfter(tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail) {
                return;
            }
            remove(nodeToInsert);

            nodeToInsert.next = node;
            nodeToInsert.prev = node.prev;

            if (node.prev == null) {
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail) {
                return;
            }
            remove(nodeToInsert);

            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;

            if (node.next == null) {
                tail = nodeToInsert;
            } else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position == 1) {
                setHead(nodeToInsert);
                return;
            }

            int pos = 1;
            Node node = head;
            while (node != null) {
                if (pos == position) {
                    insertBefore(node, nodeToInsert);
                    return;
                }
                node = node.next;
                pos++;
            }
            setTail(nodeToInsert);
        }

        public void removeNodesWithValue(int value) {
            Node node = head;
            while (node != null) {
                Node temp = node.next;
                if (node.value == value) {
                    remove(node);
                }
                node = temp;
            }
        }

        public void remove(Node node) {
            if (head == node) {
                head = node.next;
            }
            if (tail == node) {
                tail = node.prev;
            }
            movePointersExistingNode(node);
        }

        public boolean containsNodeWithValue(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) {
                    return true;
                }
                node = node.next;
            }
            return false;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }
}
