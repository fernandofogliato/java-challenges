package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StaircaseTraversalTest {

    @Test
    public void case1() {
        int height = 4;
        int maxSteps = 2;
        assertThat(StaircaseTraversal.staircaseTraversal(height, maxSteps)).isEqualTo(5);
    }
}