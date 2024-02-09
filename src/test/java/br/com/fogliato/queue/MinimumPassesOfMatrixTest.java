package br.com.fogliato.queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumPassesOfMatrixTest {

    @Test
    void case1() {
        int[][] matrix = {
            {1, 0, 0, -2, -3},
            {-4, -5, -6, -2, -1},
            {0, 0, 0, 0, -1},
            {1, 2, 3, 0, -2}
        };
        assertThat(MinimumPassesOfMatrix.minimumPassesOfMatrix(matrix)).isEqualTo(7);
    }
}