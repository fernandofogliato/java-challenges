package br.com.fogliato.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortedArrayToBinarySearchTreeTest {

    @Test
    public void case1() {
        int[] nums = new int[] { -10, -3, 0, 5, 9 };

        assertThat(new SortedArrayToBinarySearchTree().sortedArrayToBST(nums)).isNotNull();
    }

}