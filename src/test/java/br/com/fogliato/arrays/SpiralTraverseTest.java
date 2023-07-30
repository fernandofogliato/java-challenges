package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpiralTraverseTest {

    @Test
    public void case1() {
        int[][] array = new int[][] {
            new int[] {1, 2, 3, 4},
            new int[] {12, 13, 14, 5},
            new int[] {11, 16, 15, 6},
            new int[] {10, 9, 8, 7},
        };
        assertThat(SpiralTraverse.spiralTraverse(array))
                .containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
    }

    @Test
    public void case2() {
        int[][] array = new int[][] {
            new int[] {19, 32, 33, 34, 25, 8},
            new int[] {16, 15, 14, 13, 12, 11},
            new int[] {18, 31, 36, 35, 26, 9},
            new int[] {1, 2, 3, 4, 5, 6},
            new int[] {20, 21, 22, 23, 24, 7},
            new int[] {17, 30, 29, 28, 27, 10}
        };
        assertThat(SpiralTraverse.spiralTraverse(array))
                .containsExactly(19, 32, 33, 34, 25, 8, 11, 9, 6, 7, 10, 27, 28, 29, 30, 17, 20, 1, 18, 16, 15, 14, 13, 12, 26, 5, 24, 23, 22, 21, 2, 31, 36, 35, 4, 3);
    }
}