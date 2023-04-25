package br.com.fogliato.stringmanipulation;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String cleanedString = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder reversedString = new StringBuilder();
        for (int i = cleanedString.length() -1; i >= 0; i--) {
            char c = cleanedString.charAt(i);
            reversedString.append(c);
        }
        return cleanedString.equals(reversedString.toString());
    }
}
