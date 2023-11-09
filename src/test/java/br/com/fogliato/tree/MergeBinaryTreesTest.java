package br.com.fogliato.tree;

import br.com.fogliato.tree.MergeBinaryTrees.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeBinaryTreesTest {

    @Test
    public void case1() {
        BinaryTree tree1 = new BinaryTree(1);
        tree1.left = new BinaryTree(3);
        tree1.left.left = new BinaryTree(7);
        tree1.left.right = new BinaryTree(4);
        tree1.right = new BinaryTree(2);

        BinaryTree tree2 = new BinaryTree(1);
        tree2.left = new BinaryTree(5);
        tree2.left.left = new BinaryTree(2);
        tree2.right = new BinaryTree(9);
        tree2.right.left = new BinaryTree(7);
        tree2.right.right = new BinaryTree(6);

        MergeBinaryTrees.mergeBinaryTrees(tree1, tree2);

        assertThat(tree1.value).isEqualTo(2);
        assertThat(tree1.left.value).isEqualTo(8);
        assertThat(tree1.left.left.value).isEqualTo(9);
        assertThat(tree1.left.right.value).isEqualTo(4);
        assertThat(tree1.right.value).isEqualTo(11);
        assertThat(tree1.right.left.value).isEqualTo(7);
        assertThat(tree1.right.right.value).isEqualTo(6);
    }
}