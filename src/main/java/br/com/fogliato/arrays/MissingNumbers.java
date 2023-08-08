package br.com.fogliato.arrays;

import java.util.HashSet;
import java.util.Set;

// https://www.algoexpert.io/questions/missingNumbers
public class MissingNumbers {

    // Time O(n)
    // Space O(n)
    public static int[] missingNumbers(int[] nums) {
        Set<Integer> includedNums = new HashSet<>();
        for (int num: nums) {
            includedNums.add(num);
        }

        int[] result = new int[2];
        int idx = 0;
        for (int i = 1; i <= nums.length + 2; i++) {
            if (!includedNums.contains(i)) {
                result[idx] = i;
                idx++;
            }
        }
        return result;
    }
}
