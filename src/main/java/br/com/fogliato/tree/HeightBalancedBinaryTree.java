package br.com.fogliato.tree;

// https://www.algoexpert.io/questions/height-balanced-binary-tree
public class HeightBalancedBinaryTree {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value + "";
        }
    }

    // Time O(n) time where n is the number of nodes
    // Space O(h) space where h is the height of the tree
    public static boolean heightBalancedBinaryTree(BinaryTree tree) {
        int heightLeftTree = getHeight(tree.left);
        int heightRightTree = getHeight(tree.right);
        int diff = Math.abs(heightLeftTree - heightRightTree);
        if (diff < 0 || diff > 1) {
            return false;
        }
        return heightBalancedBinaryTree(tree.left) && heightBalancedBinaryTree(tree.right);
    }

    private static int getHeight(BinaryTree node) {
        if (node == null) {
            return 0;
        }

        int heightLeft = getHeight(node.left);
        int heightRight = getHeight(node.right);
        return Math.max(heightLeft, heightRight) +1;
    }
}
