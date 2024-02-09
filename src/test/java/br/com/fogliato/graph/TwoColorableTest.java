package br.com.fogliato.graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoColorableTest {

    @Test
    public void case1() {
        int[][] edges = new int[][] {
                new int[]{1, 2},
                new int[]{0, 2},
                new int[]{0, 1},
        };
        assertThat(TwoColorable.twoColorable(edges)).isFalse();
    }

    @Test
    public void case2() {
        int[][] edges = new int[][] {
                new int[]{1},
                new int[]{0}
        };
        assertThat(TwoColorable.twoColorable(edges)).isTrue();
    }

    @Test
    public void case3() {
        int[][] edges = new int[][] {
                new int[]{1, 2, 3},
                new int[]{0},
                new int[]{0},
                new int[]{0},
        };
        assertThat(TwoColorable.twoColorable(edges)).isTrue();
    }
}