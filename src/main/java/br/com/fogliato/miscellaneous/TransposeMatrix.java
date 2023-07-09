package br.com.fogliato.miscellaneous;

public class TransposeMatrix {
    /*
    You're given a 2D array of integers matrix. Write a function that returns the transpose of the matrix.
    The transpose of a matrix is a flipped version of the original matrix across its main diagonal (which runs from top-left
    to bottom-right); it switches the row and column indices of the original matrix.
    You can assume the input matrix always has at least 1 value; however its width and height are not necessarily the same.
     */
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[0].length; row++) {
                transposedMatrix[row][col] = matrix[col][row];
            }
        }
        return transposedMatrix;
    }
}
