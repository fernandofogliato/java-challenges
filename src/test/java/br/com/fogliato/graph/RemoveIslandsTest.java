package br.com.fogliato.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveIslandsTest {

    @Test
    public void case1() {
        int[][] matrix = new int[][] {
            new int[]{ 1, 0, 0, 0, 0, 0 },
            new int[]{ 0, 1, 0, 1, 1, 1 },
            new int[]{ 0, 0, 1, 0, 1, 0 },
            new int[]{ 1, 1, 0, 0, 1, 0 },
            new int[]{ 1, 0, 1, 1, 0, 0 },
            new int[]{ 1, 0, 0, 0, 0, 1 }
        };

        new RemoveIslands().removeIslands(matrix);
        int[][] expected = new int[][] {
                new int[]{ 1, 0, 0, 0, 0, 0 },
                new int[]{ 0, 0, 0, 1, 1, 1 },
                new int[]{ 0, 0, 0, 0, 1, 0 },
                new int[]{ 1, 1, 0, 0, 1, 0 },
                new int[]{ 1, 0, 0, 0, 0, 0 },
                new int[]{ 1, 0, 0, 0, 0, 1 }
        };
        Assertions.assertArrayEquals(matrix, expected);
    }
}