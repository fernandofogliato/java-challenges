package br.com.fogliato.dynamicprogramming;

// https://leetcode.com/problems/min-cost-climbing-stairs
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] memo = new int[length];
        memo[0] = cost[0];
        memo[1] = cost[1];

        for (int i = 2; i < length; i++) {
            memo[i] = Math.min(memo[i-1], memo[i-2]) + cost[i];
        }
        return Math.min(memo[length-1], memo[length-2]);
    }
}
