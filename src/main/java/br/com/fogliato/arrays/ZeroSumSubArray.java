package br.com.fogliato.arrays;

import java.util.HashSet;
import java.util.Set;

// https://www.algoexpert.io/questions/zero-sum-subarray
public class ZeroSumSubArray {

    public static boolean zeroSumSubArray(int[] nums) {
        Set<Integer> sums = new HashSet<>();
        sums.add(0);

        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (sums.contains(currentSum)) {
                return true;
            }
            sums.add(currentSum);
        }

        return false;
    }
}
