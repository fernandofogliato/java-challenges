package br.com.fogliato.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://www.algoexpert.io/questions/remove-islands
public class RemoveIslands {

    private class Node {
        int row;
        int col;

        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // Time O(wh) | Space O(wh) - where w and h are the width and height of the input matrix
    public int[][] removeIslands(int[][] matrix) {
        boolean[][] onesConnectedToBorder = new boolean[matrix.length][];
        for (int row = 0; row < matrix.length; row++) {
            onesConnectedToBorder[row] = new boolean[matrix[row].length];
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++ ) {
                if (matrix[row][col] == 0) {
                    continue;
                }
                boolean rowIsBorder = row == 0 || row == matrix.length-1;
                boolean colIsBorder = col == 0 || col == matrix[row].length-1;
                if (rowIsBorder || colIsBorder) {
                    removeIslands(row, col, matrix, onesConnectedToBorder);
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++ ) {
                if (!onesConnectedToBorder[row][col]) {
                    matrix[row][col] = 0;
                }
            }
        }
        return matrix;
    }

    private void removeIslands(int row, int col, int[][]matrix, boolean[][] onesConnectedToBorder) {
        Stack<Node> stack = new Stack<>();
        stack.add(new Node(row, col));

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            // Already visited
            if (onesConnectedToBorder[node.row][node.col]) {
                continue;
            }
            onesConnectedToBorder[node.row][node.col] = true;

            List<Node> unvisitedNeighbors = getNeighbors(node, matrix);
            stack.addAll(unvisitedNeighbors);
        }
    }

    private List<Node> getNeighbors(Node node, int[][]matrix) {
        List<Node> neighbors = new ArrayList<>();
        int row = node.row;
        int col = node.col;

        // Top
        if (row > 0 && matrix[row-1][col] == 1) {
            neighbors.add(new Node(row-1, col));
        }

        // Right
        if (col < matrix[row].length-1 && matrix[row][col+1] == 1) {
            neighbors.add(new Node(row, col+1));
        }

        // Bottom
        if (row < matrix.length-1 && matrix[row+1][col] == 1) {
            neighbors.add(new Node(row+1, col));
        }

        // Left
        if (col > 0 && matrix[row][col-1] == 1) {
            neighbors.add(new Node(row, col-1));
        }

        return neighbors;
    }

}
