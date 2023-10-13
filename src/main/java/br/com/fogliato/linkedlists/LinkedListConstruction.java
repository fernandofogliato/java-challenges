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
            movePointersExistingNode(node);

            // If we are setting teh tail as the head
            if (isTail(node)) {
                tail = node.prev;
            }

            if (head != null) {
                head.prev = node;
            }
            node.prev = null;
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;
            }
        }

        private boolean isTail(Node node) {
            return node.next == null && node.prev != null;
        }

        private void movePointersExistingNode(Node node) {
            if (node.prev != null) {
                node.prev.next = node.next;
            }

            if (node.next != null) {
                node.next.prev = node.prev;
            }
        }

        public void setTail(Node node) {
            movePointersExistingNode(node);

            // If is the head that we are setting as the tail
            if (isHead(node)) {
                head = node.next;
            }

            node.next = null;
            if (tail != null) {
                tail.next = node;
            }
            node.prev = tail;
            tail = node;
            if (head == null) {
                head = tail;
            }
        }

        private boolean isHead(Node node) {
            return node.prev == null && node.next != null;
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            movePointersExistingNode(nodeToInsert);

            if (isTail(nodeToInsert)) {
                tail = nodeToInsert.prev;
            }

            if (isHead(nodeToInsert)) {
                head = nodeToInsert.next;
            }

            nodeToInsert.next = node;
            nodeToInsert.prev = node.prev;

            if (node.prev != null) {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;

            if (nodeToInsert.prev == null) {
                head = nodeToInsert;
            }
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            movePointersExistingNode(nodeToInsert);

            if (isHead(nodeToInsert)) {
                head = nodeToInsert.next;
            }

            if (node.next != null) {
                node.next.prev = nodeToInsert;
            }
            nodeToInsert.next = node.next;
            nodeToInsert.prev = node;
            node.next = nodeToInsert;

            if (nodeToInsert.next == null) {
                setTail(nodeToInsert);
            }
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position <= 2 && isHead(nodeToInsert)) {
                return;
            }

            if (position <= 1) {
                setHead(nodeToInsert);
                return;
            }

            int pos = 1;
            Node node = head;
            while (node != null) {
                if (pos == position) {
                    insertBefore(node, nodeToInsert);
                    break;
                }
                node = node.next;
                pos++;
            }
        }

        public void removeNodesWithValue(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) {
                    if (node.prev == null) {
                        head = node.next;
                    }
                    if (node.next == null) {
                        tail = node.prev;
                    }

                    movePointersExistingNode(node);
                }
                node = node.next;
            }
        }

        public void remove(Node nodeToDelete) {
            Node node = head;
            while (node != null) {
                if (node.value == nodeToDelete.value) {
                    if (node.prev == null) {
                        head = node.next;
                    }
                    if (node.next == null) {
                        tail = node.prev;
                    }

                    movePointersExistingNode(node);
                    break;
                }
                node = node.next;
            }
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
