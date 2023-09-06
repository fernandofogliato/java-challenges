package br.com.fogliato.tree;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/find-kth-largest-value-in-bst
public class FindKthLargestValueInBst {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    // Time O (h + k) where h is the height of the tree and k is the input parameter
    // Space O (h) where h is the height of the tree
    public static int findKthLargestValueInBst(BST tree, int k) {
        List<Integer> values = new ArrayList<>(k);
        reverseInOrderTraversal(tree, values, k);
        return values.get(k-1);
    }

    private static void reverseInOrderTraversal(BST tree, List<Integer> array, int k) {
        if (tree == null || array.size() == k) {
            return;
        }

        reverseInOrderTraversal(tree.right, array, k);
        array.add(tree.value);
        reverseInOrderTraversal(tree.left, array, k);
    }
}
