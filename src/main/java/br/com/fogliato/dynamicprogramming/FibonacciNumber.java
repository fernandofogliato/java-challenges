package br.com.fogliato.dynamicprogramming;

// https://leetcode.com/problems/fibonacci-number
public class FibonacciNumber {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
