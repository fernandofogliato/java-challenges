package br.com.fogliato.tree;

// https://www.algoexpert.io/questions/invert-binary-tree
public class InvertBinaryTree {

    // Time O(n) where n is the number of nodes
    // Space O(d) where d is the depth (height) of the tree
    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        BinaryTree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;

        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
