package br.com.fogliato.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.fogliato.tree.BinaryTreeDiameter.BinaryTree;

class BinaryTreeDiameterTest {

    @Test
    public void case1() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(3);
        root.right = new BinaryTree(2);

        root.left.left = new BinaryTree(7);
        root.left.left.left = new BinaryTree(8);
        root.left.left.left.left = new BinaryTree(9);

        root.left.right = new BinaryTree(4);
        root.left.right.right = new BinaryTree(5);
        root.left.right.right.right = new BinaryTree(6);

        Assertions.assertThat(BinaryTreeDiameter.binaryTreeDiameter(root)).isEqualTo(6);
    }
}