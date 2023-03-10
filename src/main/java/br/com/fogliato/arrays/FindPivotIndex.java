package br.com.fogliato.arrays;

// https://leetcode.com/problems/find-pivot-index
public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = 0;
            for (int j = nums.length -1; j > i; j--) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = new int[] { 1, 7, 3, 6, 5, 6 };
        int[] nums = new int[] { -1,-1,0,0,-1,-1 };
        System.out.println(pivotIndex(nums));
    }
}
