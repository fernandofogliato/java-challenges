package br.com.fogliato.tree;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
public class MaximumDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = 1;
        int rightMaxDepth = 1;

        if (root.left != null) {
            leftMaxDepth += maxDepth(root.left);
        }

        if (root.right != null) {
            rightMaxDepth += maxDepth(root.right);
        }
        return Math.max(leftMaxDepth, rightMaxDepth);
    }
}
