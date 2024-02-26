package br.com.fogliato.recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://www.algoexpert.io/questions/reveal-minesweeper
public class RevealMinesweeper {

    private RevealMinesweeper() {

    }

    static class Cell {
        public final int row;
        public final int col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // O(w * h) time | O(w * h) space - where w is the width of the board, and h is the height of the board
    public static String[][] revealMinesweeper(String[][] board, int row, int column) {
        // Clicked on a mine, end game
        if (board[row][column].equals("M")) {
            board[row][column] = "X";
            return board;
        }
        markAdjacentCells(board, row, column);
        return board;
    }

    private static void markAdjacentCells(String[][] board, int row, int column) {
        Deque<Cell> stack = new ArrayDeque<>();
        stack.add(new Cell(row, column));

        while (!stack.isEmpty()) {
            Cell cell = stack.pop();
            String val = board[cell.row][cell.col];

            if (val.equals("H")) {
                List<Cell> neighbors = getNeighbors(board, cell.row, cell.col);
                int totalMines = 0;
                for (Cell neighbor: neighbors) {
                    String valNeighbor = board[neighbor.row][neighbor.col];
                    if (valNeighbor.equals("M")) {
                        totalMines++;
                    }
                }

                if (totalMines == 0) {
                    stack.addAll(neighbors);
                }
                board[cell.row][cell.col] = String.valueOf(totalMines);
            }
        }
    }

    private static List<Cell> getNeighbors(String[][] board, int row, int col) {
        List<Cell> neighbors = new ArrayList<>(8);

        // Check Top
        addToListIfValidNeighbor(board, row-1, col, neighbors);

        // Check Right
        addToListIfValidNeighbor(board, row, col +1, neighbors);

        // Check Bottom
        addToListIfValidNeighbor(board, row+1, col, neighbors);

        // Check Left
        addToListIfValidNeighbor(board, row, col-1, neighbors);

        // Check Top-Left Diagonal
        addToListIfValidNeighbor(board, row-1, col-1, neighbors);

        // Check Top-Right Diagonal
        addToListIfValidNeighbor(board, row-1, col+1, neighbors);

        // Check Bottom-Left Diagonal
        addToListIfValidNeighbor(board, row+1, col-1, neighbors);

        // Check Bottom-Right Diagonal
        addToListIfValidNeighbor(board, row+1, col+1, neighbors);

        return neighbors;
    }

    private static void addToListIfValidNeighbor(String[][] board, int row, int col, List<Cell> neighbors) {
        boolean isOutsideBoundaries = row < 0 || row >= board.length || col < 0 || col >= board[row].length;
        boolean isAlreadyMarked = !isOutsideBoundaries && !board[row][col].equals("M") && !board[row][col].equals("H");
        if (isOutsideBoundaries || isAlreadyMarked) {
            return;
        }
        neighbors.add(new Cell(row, col));
    }
}
