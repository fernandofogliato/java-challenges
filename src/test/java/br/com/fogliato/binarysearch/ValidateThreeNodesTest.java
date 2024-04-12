package br.com.fogliato.binarysearch;

import br.com.fogliato.binarysearch.ValidateThreeNodes.BST;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateThreeNodesTest {

    @Test
    void case1() {
        BST root = new BST(5);
        BST node0 = new BST(0);
        BST node1 = new BST(1);
        BST node2 = new BST(2);
        BST node3 = new BST(3);
        BST node4 = new BST(4);
        BST node6 = new BST(6);
        BST node7 = new BST(7);
        BST node8 = new BST(8);

        root.left = node2;
        root.right = node7;

        node2.left = node1;
        node2.right = node4;

        node1.left = node0;
        node4.left = node3;

        node7.left = node6;
        node7.right = node8;

        assertThat(ValidateThreeNodes.validateThreeNodes(root, node2, node3)).isTrue();
    }
}