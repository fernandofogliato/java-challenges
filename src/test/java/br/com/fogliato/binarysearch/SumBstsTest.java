package br.com.fogliato.binarysearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SumBstsTest {

    @Test
    void case1() {
        SumBsts.BinaryTree tree = new SumBsts.BinaryTree(2);
        tree.left = new SumBsts.BinaryTree(1);
        tree.right = new SumBsts.BinaryTree(3);

        Assertions.assertThat(SumBsts.sumBsts(tree)).isEqualTo(6);
    }
}