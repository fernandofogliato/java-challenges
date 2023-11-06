package br.com.fogliato.sort;

import java.util.List;

// https://www.algoexpert.io/questions/sort-stack
public class SortStack {

    public static List<Integer> sortStack(List<Integer> stack) {
        sort(stack);
        return stack;
    }

    // O(n^2) | O(n) where n is the length of the stack.
    private static void sort(List<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int lastIdx = stack.size()-1;
        int topValue = stack.remove(lastIdx);
        sort(stack);
        insert(stack, topValue);
    }

    private static void insert(List<Integer> stack, int value) {
        int lastIdx = stack.size()-1;
        int topValue = stack.isEmpty() ? Integer.MIN_VALUE : stack.get(lastIdx);

        if (value > topValue) {
            stack.add(value);
            return;
        }

        stack.remove(lastIdx);
        insert(stack, value);
        stack.add(topValue);
    }
}
