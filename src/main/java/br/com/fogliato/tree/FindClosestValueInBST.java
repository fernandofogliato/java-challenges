package br.com.fogliato.tree;

public class FindClosestValueInBST {
    // Average time complexity O(log N)
    // Worst time complexity O(N)
    // Space complexity O(1)
    public static int findClosestValueInBst(BST tree, int target) {
        BST node = tree;
        int closestValue = 0;
        while (node != null) {
            // Check if the node has a closer value
            if (Math.abs(target - closestValue) > Math.abs(target - node.value)) {
                closestValue = node.value;
            }

            // If closestValue and target are equal just break the loop and return the response
            if (closestValue == target) {
                break;
            }

            // Since is a BST we can skip some nodes by checking the node value against the target value
            if (target > node.value) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
