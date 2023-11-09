package br.com.fogliato.tree;

// https://www.algoexpert.io/questions/merge-binary-trees
public class MergeBinaryTrees {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    // O(n) time | O(h) space - where n is the number of nodes in the smaller of the two trees and h is the height of the shorter tree.
    public static BinaryTree mergeBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
        if (tree1 == null) {
            return tree2;
        }

        if (tree2 == null) {
            return tree1;
        }

        tree1.value += tree2.value;
        tree1.left = mergeBinaryTrees(tree1.left, tree2.left);
        tree1.right = mergeBinaryTrees(tree1.right, tree2.right);
        return tree1;
    }
}
