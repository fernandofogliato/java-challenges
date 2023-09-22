package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static br.com.fogliato.tree.FindSuccessor.BinaryTree;
import static org.assertj.core.api.Assertions.assertThat;

class FindSuccessorTest {

    @Test
    public void case1() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);

        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.left.right.left = new BinaryTree(6);
        root.left.right.right = new BinaryTree(7);

        root.left.right.right.left = new BinaryTree(8);

        BinaryTree node = root.left.right; // 5
        BinaryTree result = FindSuccessor.findSuccessor(root, root.left.right);
        assertThat(result.value).isEqualTo(8);
    }
}