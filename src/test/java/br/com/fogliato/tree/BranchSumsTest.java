package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BranchSumsTest {

    @Test
    public void case1() {
        BranchSums.BinaryTree root = new BranchSums.BinaryTree(1);
        root.left = new BranchSums.BinaryTree(2);
        root.left.left = new BranchSums.BinaryTree(4);
        root.left.left.left = new BranchSums.BinaryTree(8);
        root.left.left.right = new BranchSums.BinaryTree(9);

        root.left.right = new BranchSums.BinaryTree(5);
        root.left.right.left = new BranchSums.BinaryTree(10);

        root.right = new BranchSums.BinaryTree(3);
        root.right.left = new BranchSums.BinaryTree(6);
        root.right.right = new BranchSums.BinaryTree(7);

        assertThat(BranchSums.branchSums(root)).containsExactly(15, 16, 18, 10, 11);
    }
}