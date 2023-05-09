package br.com.fogliato.tree;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/627/
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode root1, TreeNode root2) {
        // If both are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // If one of the sides is null return false
        if (root1 == null || root2 == null) {
            return false;
        }

        return root1.val == root2.val
                && isMirror(root1.left, root2.right)
                && isMirror(root1.right, root2.left);
    }
}
