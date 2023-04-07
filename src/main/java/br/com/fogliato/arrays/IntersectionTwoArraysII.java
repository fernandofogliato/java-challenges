package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
public class IntersectionTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersect = new ArrayList<>();
        var i = 0;
        var j = 0;
        while (i < nums1.length && j < nums2.length) {
            var n1 = nums1[i];
            var n2 = nums2[j];

            if (n1 < n2) {
                i++;
            } else if (n1 > n2) {
                j++;
            } else {
                intersect.add(n1);
                i++;
                j++;
            }
        }

        int[] result = new int[intersect.size()];
        for (int k = 0; k < intersect.size(); k++) {
            result[k] = intersect.get(k);
        }
        return result;
    }
}
