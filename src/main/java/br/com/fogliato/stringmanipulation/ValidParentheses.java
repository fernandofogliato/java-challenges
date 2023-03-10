package br.com.fogliato.stringmanipulation;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char currentChar : chars) {
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
                continue;
            }

            // If the stack is empty but the current char is a closing bracket return false
            if (stack.isEmpty()) {
                return false;
            }

            if (currentChar == ')' && stack.peek() != '(') {
                return false;
            }

            if (currentChar == '}' && stack.peek() != '{') {
                return false;
            }

            if (currentChar == ']' && stack.peek() != '[') {
                return false;
            }
            stack.pop();
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[([]])";
        System.out.println(isValid(s));
    }
}
