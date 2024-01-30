package br.com.fogliato.graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CycleInGraphTest {

    @Test
    public void case1() {
        int[][] edges = new int[][]{
            new int[]{1, 3},
            new int[]{2, 3, 4},
            new int[]{0},
            new int[]{},
            new int[]{2, 5},
            new int[]{}
        };
        assertThat(CycleInGraph.cycleInGraph(edges)).isTrue();
    }

    @Test
    public void case2() {
        int[][] edges = new int[][]{
                new int[]{1, 2},
                new int[]{2},
                new int[]{},
        };
        assertThat(CycleInGraph.cycleInGraph(edges)).isFalse();
    }
}