package br.com.fogliato.miscellaneous;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TransposeMatrixTest {

    @Test
    public void case1() {
        int[][] matrix = {
            {1, 2}
        };
        Assertions.assertThat(new TransposeMatrix().transposeMatrix(matrix))
                .containsExactly(new int[]{ 1 }, new int[]{ 2 });
    }

}