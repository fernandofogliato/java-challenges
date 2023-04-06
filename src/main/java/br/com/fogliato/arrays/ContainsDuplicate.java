package br.com.fogliato.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            var n = nums[i];
            if (seen.contains(n)) {
                return true;
            }
            seen.add(n);
        }
        return false;
    }
}
