package br.com.fogliato.binarysearch;

// https://leetcode.com/problems/binary-search
public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int middleIndex = (left + right) / 2;
            int middleValue = nums[middleIndex];

            if (middleValue == target) {
                return middleIndex;
            }

            if (target > middleValue) {
                left = middleIndex+1;
            } else {
                right = middleIndex-1;
            }
        }
        return -1;
    }
}
