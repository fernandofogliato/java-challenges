package br.com.fogliato.tree;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class SortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length -1);
    }

    private TreeNode createBST(int nums[], int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, l, mid - 1);
        root.right = createBST(nums, mid + 1, r);
        return root;
    }
}
