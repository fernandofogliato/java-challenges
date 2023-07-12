package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NodeDepthsTest {

    @Test
    public void case1() {
        NodeDepths.BinaryTree tree = new NodeDepths.BinaryTree(1);
        tree.left = new NodeDepths.BinaryTree(2);
        tree.right = new NodeDepths.BinaryTree(3);

        tree.left.left = new NodeDepths.BinaryTree(4);
        tree.left.right = new NodeDepths.BinaryTree(5);

        tree.left.left.left = new NodeDepths.BinaryTree(8);
        tree.left.left.right = new NodeDepths.BinaryTree(9);

        tree.right.left = new NodeDepths.BinaryTree(6);
        tree.right.right = new NodeDepths.BinaryTree(7);

        assertThat(NodeDepths.nodeDepths(tree)).isEqualTo(16);
    }
}
