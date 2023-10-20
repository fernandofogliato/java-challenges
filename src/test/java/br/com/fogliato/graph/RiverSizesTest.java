package br.com.fogliato.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RiverSizesTest {

    @Test
    public void case1() { 
        int[][] matrix = new int[][]{
            new int[]{ 1, 0, 0, 1, 0 },
            new int[]{ 1, 0, 1, 0, 0 },
            new int[]{ 0, 0, 1, 0, 1 },
            new int[]{ 1, 0, 1, 0, 1 },
            new int[]{ 1, 0, 1, 1, 0 }
          };
        List<Integer> riverSizes = RiverSizes.riverSizes(matrix);
        assertThat(riverSizes).contains(1, 2, 2, 2, 5);
    }
}