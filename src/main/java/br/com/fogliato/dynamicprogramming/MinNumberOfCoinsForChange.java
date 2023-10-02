package br.com.fogliato.dynamicprogramming;

// https://www.algoexpert.io/questions/min-number-of-coins-for-change
public class MinNumberOfCoinsForChange {

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] numOfCoins = new int[n+1];
        for (int i = 1; i < numOfCoins.length; i++) {
            numOfCoins[i] = Integer.MAX_VALUE;
        }

        for (int denom : denoms) {
            for (int amount = 1; amount < numOfCoins.length; amount++) {
                int diff = amount - denom;
                if (amount >= denom && numOfCoins[diff] < Integer.MAX_VALUE) {
                    numOfCoins[amount] = Math.min(numOfCoins[amount], numOfCoins[diff] + 1);
                }
            }
        }
        int coins = numOfCoins[n];
        return coins == Integer.MAX_VALUE ? -1 : coins;
    }
}
