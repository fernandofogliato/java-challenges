package br.com.fogliato.recursion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class BlackjackProbability {

    private BlackjackProbability() {

    }

    // O(t - s) time | O(t - s) space - where t is the target, and s is the starting hand
    public static float blackjackProbability(int target, int startingHand) {
        Map<Integer, Float> memo = new HashMap<>();
        return BigDecimal.valueOf(calculateProbability(startingHand, target, memo))
                .setScale(3, RoundingMode.HALF_UP).floatValue();
    }

    private static float calculateProbability(int currentHand, int target, Map<Integer, Float> memo) {
        if (memo.containsKey(currentHand)) {
            return memo.get(currentHand);
        }

        if (currentHand > target) {
            return 1; // 100% chance of busting
        }

        // The dealer mus draw cards until their total is greater than or equal to target - 4
        if (currentHand + 4 >= target) {
            return 0;
        }

        float totalProbability = 0;

        // 10 is the number of cards available
        for (int drawnCard = 1; drawnCard <= 10; drawnCard++) {
            totalProbability += 0.1f * calculateProbability(currentHand + drawnCard, target, memo);
        }

        memo.put(currentHand, totalProbability);
        return totalProbability;
    }
}
