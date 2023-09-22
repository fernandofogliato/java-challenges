package br.com.fogliato.tree;

// https://www.algoexpert.io/questions/find-successor
public class FindSuccessor {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "BinaryTree{" +
                    "value=" + value +
                    '}';
        }
    }

    // Time O(h) where h is the height of the tree
    // Space (1)
    public static BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        if (node.right != null) {
            return getLeftmostChild(node.right);
        }
        return getRightmostParent(node);
    }

    public static BinaryTree getLeftmostChild(BinaryTree node) {
        BinaryTree currentNode = node;
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode;
    }

    public static BinaryTree getRightmostParent(BinaryTree node) {
        BinaryTree currentNode = node.right;
        while (currentNode.parent != null && currentNode.parent.right == currentNode) {
            currentNode = currentNode.parent;
        }
        return currentNode.parent;
    }
}
