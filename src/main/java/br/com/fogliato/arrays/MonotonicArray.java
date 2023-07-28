package br.com.fogliato.arrays;

// https://www.algoexpert.io/questions/monotonic-array
public class MonotonicArray {

    // Time: O(n)
    // Space: O(1)
    public static boolean isMonotonic(int[] array) {
        Boolean directionUpper = null;
        for (int i = 0; i < array.length-1; i++) {
            int curr = array[i];
            int next = array[i+1];

            // If both are same just moves to the next iteration
            if (curr == next) {
                continue;
            }

            // Set the directionUpper variable for the first time to determine if all subsequent values
            // should be higher or lower than the previous element
            if (directionUpper == null) {
                directionUpper = next > curr;
            }

            if (directionUpper) {
                if (curr > next) {
                    return false;
                }
            } else {
                if (next > curr) {
                    return false;
                }
            }
        }
        return true;
    }
}
