package br.com.fogliato.arrays;

import java.util.HashMap;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            var number = nums[i];
            var valueNeeded = target - number;
            if (map.containsKey(valueNeeded)) {
                return new int[] { map.get(valueNeeded), i };
            }
            map.put(number, i);
        }
        return new int[] {};
    }
}
