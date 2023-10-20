package br.com.fogliato.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://www.algoexpert.io/questions/river-sizes
public class RiverSizes {

    static class Node {
        int row;
        int col;

        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> riverSizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][];
        for (int row = 0; row < matrix.length; row++) {
            visited[row] = new boolean[matrix[row].length];
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (visited[row][col]) {
                    continue;
                }
                Node node = new Node(row, col);
                traverseNode(node, matrix, visited, riverSizes);
            }

        }
        return riverSizes;
    }

    private static void traverseNode(Node node, int[][] matrix, boolean[][] visited, List<Integer> riverSizes) {
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        int riverSize = 0;

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            if (visited[curr.row][curr.col]) {
                continue;
            }

            // Mark as visited
            visited[curr.row][curr.col] = true;

            if (matrix[curr.row][curr.col] == 0) {
                continue;
            }

            riverSize++;

            List<Node> unvisitedNeighbors = getNeighbors(curr.row, curr.col, matrix, visited);
            for (Node neighbor : unvisitedNeighbors) {
                stack.push(neighbor);
            }
        }

        if (riverSize > 0) {
            riverSizes.add(riverSize);
        }
    }

    private static List<Node> getNeighbors(int row, int col, int[][] matrix, boolean[][] visited) {
        List<Node> neighbors = new ArrayList<>();
        // Above
        if (row > 0 && !visited[row-1][col]) {
            neighbors.add(new Node(row-1, col));
        }

        // Left
        if (col > 0 && !visited[row][col-1]) {
            neighbors.add(new Node(row, col-1));
        }

        // Right
        if (col < matrix[row].length-1 && !visited[row][col+1]) {
            neighbors.add(new Node(row, col+1));
        }

        // Bellow
        if (row < matrix.length-1 && !visited[row+1][col]) {
            neighbors.add(new Node(row+1, col));
        }
        return neighbors;
    }
}
