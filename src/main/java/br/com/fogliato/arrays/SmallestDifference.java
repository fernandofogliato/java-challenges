package br.com.fogliato.arrays;

import java.util.Arrays;

// https://www.algoexpert.io/questions/smallest-difference
public class SmallestDifference {
    // Time O(n log n)
    // Space O(1)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne); // n log n
        Arrays.sort(arrayTwo); // n log n
        int idx = 0;
        int idx2 = 0;
        int smallestDiff = Integer.MAX_VALUE;
        int[] result = new int[2];
        while (idx < arrayOne.length && idx2 < arrayTwo.length) {
            int val1 = arrayOne[idx];
            int val2 = arrayTwo[idx2];
            int diff = Math.abs(val1 - val2);

            if (diff < smallestDiff) {
                smallestDiff = diff;
                result[0] = val1;
                result[1] = val2;
            }

            if (diff == 0) {
                break;
            }

            if (val1 > val2) {
                idx2++;
            } else {
                idx++;
            }
        }
        return result;
    }
}
