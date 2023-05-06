package br.com.fogliato.tree;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long leftBoundary, long rightBoundary) {
        if (node == null) {
            return true;
        }

        if (!(node.val > leftBoundary && node.val < rightBoundary)) {
            return false;
        }
        return isValid(node.left, leftBoundary, node.val) && isValid(node.right, node.val, rightBoundary);
    }
}
