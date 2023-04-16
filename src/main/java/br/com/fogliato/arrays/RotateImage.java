package br.com.fogliato.arrays;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
public class RotateImage {

    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length -1;

        while (left < right) {
            for (int i = 0; i < right - left; i++) {
                int top = left;
                int bottom = right;

                // Save the top left element
                int topLeft = matrix[top][left + i];

                // Move bottom left into top left
                matrix[top][left + i] = matrix[bottom - i][left];

                // Move bottom right into bottom left
                matrix[bottom -i][left] = matrix[bottom][right - i];

                // Move top right into bottom right
                matrix[bottom][right - i] = matrix[top + i][right];

                // Move top left into top right
                matrix[top + i][right] = topLeft;
            }

            right -= 1;
            left += 1;
        }
    }
}
