package br.com.fogliato.dynamicprogramming;

// https://www.algoexpert.io/questions/kadane's-algorithm
public class KadanesAlgorithm {

    // Time O(n) | Space O(1) - where n is the length of the input array
    public static int kadanesAlgorithm(int[] array) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int val : array) {
            currSum += val;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
