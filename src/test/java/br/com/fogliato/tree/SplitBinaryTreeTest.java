package br.com.fogliato.tree;

import br.com.fogliato.tree.SplitBinaryTree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SplitBinaryTreeTest {

    @Test
    void case1() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(1);
        root.right.right = new BinaryTree(1);

        assertThat(new SplitBinaryTree().splitBinaryTree(root)).isEqualTo(0);
    }
}