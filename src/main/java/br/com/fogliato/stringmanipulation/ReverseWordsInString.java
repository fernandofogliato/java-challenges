package br.com.fogliato.stringmanipulation;

import java.util.Stack;

// https://www.algoexpert.io/questions/reverse-words-in-string
public class ReverseWordsInString {

    // Time O(n) | Space O(n) where n is the length of the string
    public static String reverseWordsInString(String string) {
        Stack<String> stack = new Stack<>();
        int startIdxWord = 0;
        for (int i = 0; i < string.length(); i++) {
            char value = string.charAt(i);

            if (value == ' ') {
                stack.add(string.substring(startIdxWord, i));
                startIdxWord = i;
            } else if (string.charAt(startIdxWord) == ' ') {
                stack.add(" ");
                startIdxWord++;
            }
        }

        // Add the last string to the stack
        stack.add(string.substring(startIdxWord));

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
