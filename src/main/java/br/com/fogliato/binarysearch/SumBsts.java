package br.com.fogliato.binarysearch;

// https://www.algoexpert.io/questions/sum-bsts
public class SumBsts {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class TreeInfo {
        public boolean isBst;
        public int minValue;
        public int maxValue;
        public int bstSize;
        public int bstSum;
        public int totalSumBstNodes;

        public TreeInfo(boolean isBst, int minValue, int maxValue, int bstSize, int bstSum, int totalSumBstNodes) {
            this.isBst = isBst;
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.bstSize = bstSize;
            this.bstSum = bstSum;
            this.totalSumBstNodes = totalSumBstNodes;
        }
    }

    // O(n) time | O(h) space - where n is the number of nodes in the tree and h is the height of the tree
    public static int sumBsts(BinaryTree tree) {
        return getTreeInfo(tree).totalSumBstNodes;
    }

    private static TreeInfo getTreeInfo(BinaryTree tree) {
        if (tree == null) {
            return new TreeInfo(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 0, 0);
        }

        TreeInfo leftTreeInfo = getTreeInfo(tree.left);
        TreeInfo rightTreeInfo = getTreeInfo(tree.right);

        boolean isBst = tree.value > leftTreeInfo.maxValue && tree.value <= rightTreeInfo.minValue
                && leftTreeInfo.isBst && rightTreeInfo.isBst;

        int maxValue = Math.max(tree.value, Math.max(leftTreeInfo.maxValue, rightTreeInfo.maxValue));
        int minValue = Math.min(tree.value, Math.min(leftTreeInfo.minValue, rightTreeInfo.minValue));

        int bstSum = 0;
        int bstSize = 0;

        int totalSumBstNodes = leftTreeInfo.totalSumBstNodes + rightTreeInfo.totalSumBstNodes;

        if (isBst) {
            bstSum = tree.value + leftTreeInfo.bstSum + rightTreeInfo.bstSum;
            bstSize = 1 + leftTreeInfo.bstSize + rightTreeInfo.bstSize;

            if (bstSize >= 3) {
                totalSumBstNodes = bstSum;
            }
        }

        return new TreeInfo(
            isBst,
            minValue,
            maxValue,
            bstSize,
            bstSum,
            totalSumBstNodes
        );
    }
}
