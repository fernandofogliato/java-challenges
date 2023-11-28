package br.com.fogliato.arrays;

import java.util.Stack;

// https://www.algoexpert.io/questions/next-greater-element
public class NextGreaterElement {

    // Time O(n) | Space O(n) where n is the length of the array
    public static int[] nextGreaterElement(int[] array) {
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            output[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * array.length; i++) {
            int circularIdx = i % array.length;

            while (!stack.isEmpty() && array[circularIdx] > array[stack.peek()]) {
                output[stack.pop()] = array[circularIdx];
            }

            stack.add(circularIdx);
        }
        return output;
    }
}
