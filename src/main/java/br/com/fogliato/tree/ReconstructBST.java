package br.com.fogliato.tree;

import java.util.List;

// https://www.algoexpert.io/questions/reconstruct-bst
public class ReconstructBST {

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "BST{" +
                    "value=" + value +
                    '}';
        }
    }

    public static BST reconstructBst(List<Integer> preOrderTraversalValues) {
        BST root = new BST(preOrderTraversalValues.get(0));
        for (int i = 1; i < preOrderTraversalValues.size(); i++) {
            int value = preOrderTraversalValues.get(i);
            insertBst(value, root);
        }
        return root;
    }

    private static void insertBst(int value, BST tree) {
        if (value < tree.value) {
            if (tree.left != null) {
                insertBst(value, tree.left);
                return;
            }
            tree.left = new BST(value);
        } else {
            if (tree.right != null) {
                insertBst(value, tree.right);
                return;
            }
            tree.right = new BST(value);
        }
    }
}
