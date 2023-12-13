package br.com.fogliato.stack;

import java.util.Stack;

// https://www.algoexpert.io/questions/reversePolishNotation
public class ReversePolishNotation {

    // O(n) time | O(n) space where n is the number of tokens
    public static int reversePolishNotation(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (token) {
                    case "+":
                        stack.add(num1 + num2);
                        break;

                    case "-":
                        stack.add(num2 - num1);
                        break;

                    case "*":
                        stack.add(num1 * num2);
                        break;

                    case "/":
                        System.out.println(num1);
                        System.out.println(num2);
                        stack.add(num2 / num1);
                        break;

                    default:
                        break;
                }

            } else {
                stack.add(Integer.parseInt(token));
            }

        }
        return stack.pop();
    }
}
