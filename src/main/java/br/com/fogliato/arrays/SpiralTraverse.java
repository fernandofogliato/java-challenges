package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/spiral-traverse
public class SpiralTraverse {

    public static List<Integer> spiralTraverse(int[][] array) {
        int startRow = 0;
        int startCol = 0;
        int endRow = array.length-1;
        int endCol = array[0].length-1;

        List<Integer> result = new ArrayList<>();
        while (startRow <= endRow && startCol <= endCol) {

            for (int col = 0; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }

            for (int row = startRow+1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }

            for (int col = endCol-1; col >= startCol; col--) {
                result.add(array[endRow][col]);
            }

            for (int row = endRow-1; row > startRow+1; row--) {
                result.add(array[row][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }
}
