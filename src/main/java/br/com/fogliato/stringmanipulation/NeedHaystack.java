package br.com.fogliato.stringmanipulation;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
public class NeedHaystack {
    public int strStr(String haystack, String needle) {
        int i = 0;
        StringBuilder sb = new StringBuilder(needle.length());
        while (i < haystack.length()) {
            char c = haystack.charAt(i);
            i++;

            // Keep adding characters til it fits the length of the needle
            if (sb.length() < needle.length()) {
                sb.append(c);
            }

            // Check if we found the needle
            if (sb.toString().equals(needle)) {
                return i - sb.length();
            }

            // Delete the oldest char to keep the string builder with the length of the needle
            if (sb.length() >= needle.length()) {
                sb.deleteCharAt(0);
            }
        }
        return -1;
    }
}
