package br.com.fogliato.stringmanipulation;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int index = 0;

        // Skip the leading whitespaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // check if the string has a sign
        int sign = 1;
        if (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        int result = 0;
        // check the rest of the characters
        for (int i = index; i < s.length(); i++) {
            char c = s.charAt(i);

            // Stop when find a non-number
            if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9') {
                break;
            }

            // Check if the number will be out the maximum integer value
            if (result * sign > Integer.MAX_VALUE/10 || (result * sign == Integer.MAX_VALUE/10 && Character.getNumericValue(c) > 7)) {
                return Integer.MAX_VALUE;
            }

            // Check if the number will be out the minimum integer value
            if (result * sign < Integer.MIN_VALUE/10 || (result * sign == Integer.MIN_VALUE/10 && Character.getNumericValue(c) > 8)) {
                return Integer.MIN_VALUE;
            }
            result = result * 10 + Character.getNumericValue(c);
        }
        return result * sign;
    }
}
