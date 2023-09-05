package br.com.fogliato.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MinHeightBstTest {

    @Test
    public void case1() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        MinHeightBst.BST tree = MinHeightBst.minHeightBst(array);
        Assertions.assertThat(tree.value).isEqualTo(10);
        Assertions.assertThat(tree.left.value).isEqualTo(2);
        Assertions.assertThat(tree.left.left.value).isEqualTo(1);
        Assertions.assertThat(tree.left.right.value).isEqualTo(5);
        Assertions.assertThat(tree.left.right.right.value).isEqualTo(7);

        Assertions.assertThat(tree.right.value).isEqualTo(14);
        Assertions.assertThat(tree.right.left.value).isEqualTo(13);
        Assertions.assertThat(tree.right.right.value).isEqualTo(15);
        Assertions.assertThat(tree.right.right.right.value).isEqualTo(22);
    }
}