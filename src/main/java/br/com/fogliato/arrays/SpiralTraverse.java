package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/spiral-traverse
public class SpiralTraverse {

    // Time O(n)
    // Space O(n)
    public static List<Integer> spiralTraverse(int[][] array) {
        int startRow = 0;
        int startCol = 0;
        int endRow = array.length-1;
        int endCol = array[0].length-1;

        List<Integer> result = new ArrayList<>();
        while (startRow <= endRow && startCol <= endCol) {

            // From top left to top right
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }

            // From top right to bottom right
            for (int row = startRow+1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }

            // From left bottom to right bottom
            for (int col = endCol-1; col >= startCol; col--) {
                result.add(array[endRow][col]);
            }

            // From bottom left to top left
            for (int row = endRow-1; row >= startRow+1; row--) {
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
