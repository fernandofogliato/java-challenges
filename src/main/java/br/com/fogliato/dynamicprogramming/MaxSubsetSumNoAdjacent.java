package br.com.fogliato.dynamicprogramming;

// https://www.algoexpert.io/questions/max-subset-sum-no-adjacent
public class MaxSubsetSumNoAdjacent {

    // O(n) time | O(1) space where N is the number of elements in the array
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        int first = array[0];
        int second = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            int currentSum = Math.max(first, second + array[i]);
            second = first;
            first = currentSum;
        }
        return first;
    }
}
