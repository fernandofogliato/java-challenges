package br.com.fogliato.queue;

import java.util.LinkedList;
import java.util.Queue;

// https://www.algoexpert.io/questions/minimum-passes-of-matrix
public class MinimumPassesOfMatrix {

    static class Element {
        int row;
        int col;

        public Element(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // O(w + h) time | O(w + h) space - where w is the width of the matrix and h is the height
    public static int minimumPassesOfMatrix(int[][] matrix) {
        Queue<Element> negativeValues = new LinkedList<>();
        int minNumberOfPasses = 0;

        // Get all negative numbers
        getAllNegativeNumbers(matrix, negativeValues);

        // All numbers are positive
        if (negativeValues.isEmpty()) {
            return 0;
        }

        Queue<Element> numbersToBeFlipped = new LinkedList<>();

        while (!negativeValues.isEmpty()) {
            int currentSize = negativeValues.size();
            while (currentSize > 0) {
                Element element = negativeValues.remove();
                if (hasPositiveAdjacentElement(element.row, element.col, matrix)) {
                    numbersToBeFlipped.add(element);
                } else {
                    // Add the element again to the queue to be check on the next iteration
                    negativeValues.add(element);
                }
                currentSize--;
            }

            // If there are still negative numbers to be checked and no new flipped numbers that means that
            // we should stop the algorithm because we won't be able to flip all numbers to positive
            if (!negativeValues.isEmpty() && numbersToBeFlipped.isEmpty()) {
                return -1;
            }

            // Convert numbers to positive
            while (!numbersToBeFlipped.isEmpty()) {
                Element val = numbersToBeFlipped.remove();
                matrix[val.row][val.col] *= -1; // convert to a positive value
            }
            minNumberOfPasses++;
        }
        return minNumberOfPasses;
    }

    private static void getAllNegativeNumbers(int[][] matrix, Queue<Element> negativeValues) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++)  {
                if (matrix[row][col] >= 0) {
                    continue;
                }
                Element element = new Element(row, col);
                negativeValues.add(element);
            }
        }
    }

    private static boolean hasPositiveAdjacentElement(int row, int col, int[][] matrix) {
        // check right
        if (col + 1 < matrix[row].length && matrix[row][col+1] > 0) {
            return true;
        }

        // check left
        if (col - 1 >= 0 && matrix[row][col-1] > 0) {
            return true;
        }

        // check above
        if (row - 1 >= 0 && matrix[row-1][col] > 0) {
            return true;
        }

        // check below
        return row + 1 < matrix.length && matrix[row + 1][col] > 0;
    }
}
