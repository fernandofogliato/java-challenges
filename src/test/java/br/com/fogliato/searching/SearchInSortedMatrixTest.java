package br.com.fogliato.searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInSortedMatrixTest {

    @Test
    public void case1() {
        int[][] matrix = new int[][] {
            new int[]{1, 4, 7, 12, 15, 1000},
            new int[]{2, 5, 19, 31, 32, 1001},
            new int[]{3, 8, 24, 33, 35, 1002},
            new int[]{40, 41, 42, 44, 45, 1003},
            new int[]{99, 100, 103, 106, 128, 1004}
        };
        int target = 44;
        assertThat(SearchInSortedMatrix.searchInSortedMatrix(matrix, target)).containsExactly(3, 3);
    }
}