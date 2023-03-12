package br.com.fogliato.greed;

import java.util.HashSet;

// hhttps://leetcode.com/problems/longest-palindrome
public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        HashSet<Character> frequency = new HashSet<>();

        int length = 0;
        for (char c : s.toCharArray()) {
            if (frequency.contains(c)) {
                length += 2;
                frequency.remove(c);
            } else {
                frequency.add(c);
            }
        }

        if (frequency.size() > 0) {
            length++;
        }
        return length;
    }
}
