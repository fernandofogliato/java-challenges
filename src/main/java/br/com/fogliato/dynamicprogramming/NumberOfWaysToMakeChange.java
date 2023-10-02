package br.com.fogliato.dynamicprogramming;

// https://www.algoexpert.io/questions/number-of-ways-to-make-change
public class NumberOfWaysToMakeChange {

    // Time O(nd) | Space O(n) where n is the target amount and d is the number of coin denominations
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n+1];
        ways[0] = 1;

        for (int denom: denoms) {
            for (int amount = 1; amount < ways.length; amount++) {
                if (denom <= amount) {
                    ways[amount] = ways[amount] + ways[amount - denom];
                }
            }
        }
        return ways[n];
    }
}
