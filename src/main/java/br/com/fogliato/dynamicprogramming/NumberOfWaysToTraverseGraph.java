package br.com.fogliato.dynamicprogramming;

// https://www.algoexpert.io/questions/number-of-ways-to-traverse-graph
public class NumberOfWaysToTraverseGraph {

    // O(n + m) time | O (n + m) space = where n is the width of the graph and m is the height
    public static int numberOfWaysToTraverseGraph(int width, int height) {
        int[][] matrix = new int[height][width];

        // Sum the number of ways
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                boolean isBorder = row == 0 || col == 0;
                if (isBorder) {
                    matrix[row][col] = 1;
                } else {
                    // Sum up and left
                    matrix[row][col] = matrix[row-1][col] + matrix[row][col-1];
                }
            }
        }
        return matrix[height-1][width-1];
    }
}
