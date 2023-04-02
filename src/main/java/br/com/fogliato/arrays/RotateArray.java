package br.com.fogliato.arrays;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
public class RotateArray {

    public void rotate(int[] nums, int k) {
        var n = nums.length;
        k %= n;
        if (n < k) {
            return;
        }
        reverse(0, n-1, nums);
        reverse(0, k-1, nums);
        reverse(k, n-1, nums);
    }

    private void reverse(int i, int j, int [] nums){
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
    }
}
