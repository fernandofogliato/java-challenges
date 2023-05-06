package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthBinaryTreeTest {

    @Test
    public void case1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        assertThat(new MaximumDepthBinaryTree().maxDepth(root)).isEqualTo(3);
    }

    @Test
    public void case2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertThat(new MaximumDepthBinaryTree().maxDepth(root)).isEqualTo(2);
    }
}