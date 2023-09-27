package br.com.fogliato.tree;

// https://www.algoexpert.io/questions/split-binary-tree
public class SplitBinaryTree {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int splitBinaryTree(BinaryTree tree) {
        int treeSum = getSum(tree);
        int targetSubtreeSize = treeSum / 2;
        if (treeSum % 2 != 0 || treeSum == tree.value) {
            return 0;
        }
        return findEdgeNode(tree, targetSubtreeSize);
    }

    private int getSum(BinaryTree node) {
        if (node == null) {
            return 0;
        }
        int leftSum = getSum(node.left);
        int rightSum = getSum(node.right);
        return leftSum + rightSum + node.value;
    }

    private int findEdgeNode(BinaryTree node, int target) {
        if (node == null) {
            return 0;
        }

        int rootSum = getSum(node);
        if (rootSum == target) {
            return target;
        }
        int edgeLeft = findEdgeNode(node.left, target);
        if (edgeLeft == target) {
            return target;
        }
        return findEdgeNode(node.right, target);
    }
}
