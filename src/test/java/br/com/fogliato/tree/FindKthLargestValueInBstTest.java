package br.com.fogliato.tree;

import br.com.fogliato.tree.FindKthLargestValueInBst.BST;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindKthLargestValueInBstTest {

    @Test
    public void case1() {
        BST tree = new BST(15);
        tree.left = new BST(5);
        tree.left.left = new BST(2);
        tree.left.right = new BST(5);
        tree.left.left.left = new BST(1);
        tree.left.left.right = new BST(3);

        tree.right = new BST(20);
        tree.right.left = new BST(17);
        tree.right.right = new BST(22);

        assertThat(FindKthLargestValueInBst.findKthLargestValueInBst(tree, 3)).isEqualTo(17);
    }
}