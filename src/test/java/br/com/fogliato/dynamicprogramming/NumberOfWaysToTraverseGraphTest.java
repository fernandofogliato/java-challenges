package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfWaysToTraverseGraphTest {

    @Test
    public void case1() {
        int width = 4;
        int height = 3;
        assertThat(NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraph(width, height)).isEqualTo(10);
    }

    @Test
    public void case2() {
        int width = 3;
        int height = 2;
        assertThat(NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraph(width, height)).isEqualTo(3);
    }
}