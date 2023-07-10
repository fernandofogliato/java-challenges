package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindClosestValueInBSTTest {

    @Test
    public void case1() {
        FindClosestValueInBST.BST tree = new FindClosestValueInBST.BST(10);
        tree.left = new FindClosestValueInBST.BST(5);
        tree.left.left = new FindClosestValueInBST.BST(2);
        tree.left.left.left = new FindClosestValueInBST.BST(1);
        tree.left.right = new FindClosestValueInBST.BST(5);

        tree.right = new FindClosestValueInBST.BST(15);
        tree.right.right = new FindClosestValueInBST.BST(22);
        tree.right.left = new FindClosestValueInBST.BST(13);
        tree.right.left.left = new FindClosestValueInBST.BST(14);

        assertThat(FindClosestValueInBST.findClosestValueInBst(tree, 12)).isEqualTo(13);
    }
}