package br.com.fogliato.arrays;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        var k = 1;
        for (int i = 1; i < nums.length; i++) {
            var n = nums[i]; // current
            var p = nums[i-1]; // previous

            if (n != p) {
                nums[k] = n;
                k++;
            }
        }
        return k;
    }
}
