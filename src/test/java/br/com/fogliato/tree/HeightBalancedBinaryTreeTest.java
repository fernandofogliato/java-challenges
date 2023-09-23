package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static br.com.fogliato.tree.HeightBalancedBinaryTree.BinaryTree;
import static org.assertj.core.api.Assertions.assertThat;

class HeightBalancedBinaryTreeTest {

    @Test
    public void case1() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(8);

        root.right = new BinaryTree(3);
        root.right.right = new BinaryTree(6);

        boolean isBalanced = HeightBalancedBinaryTree.heightBalancedBinaryTree(root);
        assertThat(isBalanced).isTrue();
    }

    @Test
    public void case2() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.left.right.left = new BinaryTree(7);
        root.left.right.right = new BinaryTree(8);

        root.right = new BinaryTree(3);
        root.right.right = new BinaryTree(6);
        root.right.right.left = new BinaryTree(9);
        root.right.right.right = new BinaryTree(10);

        boolean isBalanced = HeightBalancedBinaryTree.heightBalancedBinaryTree(root);
        assertThat(isBalanced).isFalse();
    }
}