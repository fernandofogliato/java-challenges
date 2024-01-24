package br.com.fogliato.stringmanipulation;

// https://www.algoexpert.io/questions/longest-palindromic-substring
public class LongestPalindromicSubstring {

    // O(n^2) time | O(n) space - where n is the length of the input string
    public static String longestPalindromicSubstring(String str) {
        int[] currentLongest = new int[]{ 0, 1 };
        for (int i = 0; i < str.length(); i++) {
            int[] odd = getLongestPalindromeFrom(str, i - 1, i + 1);
            int[] even = getLongestPalindromeFrom(str, i - 1, i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            currentLongest = longest[1] - longest[0] > currentLongest[1] - currentLongest[0] ? longest : currentLongest;
        }
        return str.substring(currentLongest[0], currentLongest[1]);
    }

    private static int[] getLongestPalindromeFrom(String str, int leftIdx, int rightIdx) {
        while (leftIdx >= 0 && rightIdx < str.length()) {
            if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
                break;
            }
            leftIdx -= 1;
            rightIdx += 1;
        }
        return new int[]{ leftIdx + 1, rightIdx };
    }
}
