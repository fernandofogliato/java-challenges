package br.com.fogliato.arrays;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        // Move all non-zero numbers to the beginning of the array
        var insertPos = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Set value zero to the rest of the array based on the last insertion made on the step before.
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
