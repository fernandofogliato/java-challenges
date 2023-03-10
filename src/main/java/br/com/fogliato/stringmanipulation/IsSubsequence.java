package br.com.fogliato.stringmanipulation;

// https://leetcode.com/problems/is-subsequence
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        char[] ca = s.toCharArray();
        char[] ct = t.toCharArray();
        int greatestIndexMapped = -1;

        for (char c : ca) {
            boolean found = false;
            for (int j = 0; j < ct.length; j++) {
                if (c == ct[j] && j > greatestIndexMapped) {
                    greatestIndexMapped = j;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
