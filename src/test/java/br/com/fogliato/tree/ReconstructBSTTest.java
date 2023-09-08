package br.com.fogliato.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ReconstructBSTTest {

    @Test
    public void case1() {
        List<Integer> preOrderTraversalValues = Arrays.asList(10, 4, 2, 1, 5, 17, 19, 18);
        Assertions.assertThat(ReconstructBST.reconstructBst(preOrderTraversalValues)).isNotNull();
    }
}