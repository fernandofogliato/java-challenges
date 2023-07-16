package br.com.fogliato.dynamicprogramming;

// https://leetcode.com/problems/fibonacci-number
public class FibonacciNumber {

    public int fib(int n) {
        int fib1 = 0;
        int fib2 = 1;

        for (int i = 0; i < n; i++) {
            int temp = fib1;
            fib1 = fib1 + fib2;
            fib2 = temp;
        }
        return fib1;
    }
}
