package br.com.fogliato.miscellaneous;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            var sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
