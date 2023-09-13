package br.com.fogliato.tree;

import br.com.fogliato.tree.InvertBinaryTree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InvertBinaryTreeTest {

    @Test
    public void case1() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);

        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);

        InvertBinaryTree.invertBinaryTree(root);

        assertThat(root.value).isEqualTo(1);
        assertThat(root.left.value).isEqualTo(3);
        assertThat(root.right.value).isEqualTo(2);
        assertThat(root.left.left.value).isEqualTo(7);
        assertThat(root.left.right.value).isEqualTo(6);
        assertThat(root.right.left.value).isEqualTo(5);
        assertThat(root.right.right.value).isEqualTo(4);
        assertThat(root.right.right.left.value).isEqualTo(9);
        assertThat(root.right.right.right.value).isEqualTo(8);
    }
}