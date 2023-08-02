package br.com.fogliato.arrays;

// https://www.algoexpert.io/questions/first-duplicate-value
public class FirstDuplicateValue {

    // Time O(n)
    // Space O(1)
    public static int firstDuplicateValue(int[] array) {
        for (int val : array) {
            int absVal = Math.abs(val);
            if (array[absVal-1] < 0) {
                return absVal;
            }
            array[absVal - 1] *= -1;
        }
        return -1;
    }
}
