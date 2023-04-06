package br.com.fogliato.arrays;

import java.util.Arrays;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length-1; i+=2) {
            var n1 = nums[i];
            var n2 = nums[i+1];
            if (n1 != n2) {
                return n1;
            }
        }
        return nums[nums.length-1];
    }
}
