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

        public BST(int value, BST left, BST right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    static class TreeInfo {
        int rootIdx;

        public TreeInfo(int rootIdx) {
            this.rootIdx = rootIdx;
        }
    }

    // Time O(n)
    // Space O(n)
    public static BST reconstructBst(List<Integer> preOrderTraversalValues) {
        TreeInfo treeInfo = new TreeInfo(0);
        return reconstructBstFromRange(Integer.MIN_VALUE, Integer.MAX_VALUE, preOrderTraversalValues, treeInfo);
    }

    public static BST reconstructBstFromRange(int lowerBound, int upperBound, List<Integer> preOrderTraversalValues, TreeInfo currentSubtreeInfo) {
        if (currentSubtreeInfo.rootIdx == preOrderTraversalValues.size()) {
            return null;
        }

        int rootValue = preOrderTraversalValues.get(currentSubtreeInfo.rootIdx);
        if (rootValue < lowerBound || rootValue >= upperBound) {
            return null;
        }

        currentSubtreeInfo.rootIdx += 1;
        BST leftSubtree = reconstructBstFromRange(lowerBound, rootValue, preOrderTraversalValues, currentSubtreeInfo);
        BST rightSubtree = reconstructBstFromRange(rootValue, upperBound, preOrderTraversalValues, currentSubtreeInfo);
        return new BST(rootValue, leftSubtree, rightSubtree);
    }
}
