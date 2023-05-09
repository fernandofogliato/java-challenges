package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SymmetricTreeTest {

    @Test
    public void case1() {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        head.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        assertThat(new SymmetricTree().isSymmetric(head)).isTrue();
    }

    @Test
    public void case2() {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2, null, new TreeNode(3));
        head.right = new TreeNode(2, null, new TreeNode(3));
        assertThat(new SymmetricTree().isSymmetric(head)).isFalse();
    }
}