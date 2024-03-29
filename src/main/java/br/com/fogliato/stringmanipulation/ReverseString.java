package br.com.fogliato.stringmanipulation;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
public class ReverseString {
    public void reverseString(char[] s) {
        int begin = 0;
        int end = s.length-1;
        while (begin < end) {
            char c1 = s[begin];
            char c2 = s[end];
            s[begin] = c2;
            s[end] = c1;

            begin++;
            end--;
        }
    }
}
