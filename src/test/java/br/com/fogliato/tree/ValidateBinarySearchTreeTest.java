package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateBinarySearchTreeTest {

    @Test
    public void case1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertThat(new ValidateBinarySearchTree().isValidBST(root)).isTrue();
    }

    @Test
    public void case2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4, new TreeNode(3), new TreeNode(6));
        assertThat(new ValidateBinarySearchTree().isValidBST(root)).isFalse();
    }

    @Test
    public void case3() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        assertThat(new ValidateBinarySearchTree().isValidBST(root)).isFalse();
    }

    @Test
    public void case4() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6, new TreeNode(3), new TreeNode(7));
        assertThat(new ValidateBinarySearchTree().isValidBST(root)).isFalse();
    }

    @Test
    public void case5() {
        TreeNode root = new TreeNode(-2147483648);
        root.right = new TreeNode(2147483647);
        assertThat(new ValidateBinarySearchTree().isValidBST(root)).isTrue();
    }
}