package br.com.fogliato.arrays;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = n + m -1;

        // merge in reversed order
        while (m > 0 && n > 0) {
            int n1 = nums1[m-1];
            int n2 = nums2[n-1];

            if (n2 > n1) {
                nums1[lastIndex] = n2;
                n--;
            } else {
                nums1[lastIndex] = n1;
                m--;
            }
            lastIndex--;
        }

        // Fill nums1 with leftover nums2 elements
        while (n > 0) {
            nums1[lastIndex] = nums2[n-1];
            n--;
            lastIndex--;
        }
    }
}
