package br.com.fogliato.arrays;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int midIndex = (left+right)/2;
            int val = nums[midIndex];
            if (val == target) {
                return midIndex;
            }
            if (val < target) {
                left = midIndex+1;
            } else {
                right = midIndex-1;
            }
        }
        return left;
    }
}
