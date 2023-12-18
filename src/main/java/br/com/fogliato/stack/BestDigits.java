package br.com.fogliato.stack;

import java.util.Stack;

// https://www.algoexpert.io/questions/best-digits
public class BestDigits {

    // O(n) time | O(n) space - where n is the length of the input string
    public static String bestDigits(String number, int numDigits) {
        int digitsRemoved = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            int val = Character.getNumericValue(number.charAt(i));

            while (!stack.isEmpty() && digitsRemoved < numDigits) {
                int lastVal = stack.peek();
                if (val >= lastVal) {
                    stack.pop();
                    digitsRemoved++;
                } else {
                    break;
                }
            }
            stack.add(val);
        }

        // To cover the scenario where the input string has all elements in decremented order
        while (digitsRemoved != numDigits) {
            stack.pop();
            digitsRemoved++;
        }

        // Rebuilds the string without the removed numbers
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop().toString());
        }
        return sb.toString();
    }
}
