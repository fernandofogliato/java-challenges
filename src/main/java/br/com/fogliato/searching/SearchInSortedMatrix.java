package br.com.fogliato.searching;

// https://www.algoexpert.io/questions/search-in-sorted-matrix
public class SearchInSortedMatrix {

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int rowIdx = 0;
        int colIdx = matrix[rowIdx].length-1;

        while (rowIdx < matrix.length && colIdx >= 0) {
            int val = matrix[rowIdx][colIdx];

            if (target == val) {
                return new int[] { rowIdx, colIdx};
            }

            if (target > val) {
                rowIdx++;
            } else {
                colIdx--;
            }
        }

        return new int[] {-1, -1};
    }
}
