package br.com.fogliato.miscellaneous;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/staircase-traversal
public class StaircaseTraversal {

    // O(n) time | O(n) space - where n is the height of the staircase
    public static int staircaseTraversal(int height, int maxSteps) {
        int currentNumberOfWays = 0;
        List<Integer> waysToTop = new ArrayList<>();
        waysToTop.add(1);

        for (int currentHeight = 1; currentHeight <= height; currentHeight++) {
            int startOfWindow = currentHeight - maxSteps - 1;
            int endOfWindow = currentHeight - 1;
            if (startOfWindow >= 0) {
                currentNumberOfWays -= waysToTop.get(startOfWindow);
            }

            currentNumberOfWays += waysToTop.get(endOfWindow);
            waysToTop.add(currentNumberOfWays);
        }

        return waysToTop.get(height);
    }
}
