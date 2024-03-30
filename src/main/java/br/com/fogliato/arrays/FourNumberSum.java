package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.algoexpert.io/questions/four-number-sum
public class FourNumberSum {

    private FourNumberSum() {

    }

    // O(n²) time | O(n²) space - where n is the length of the input array
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> quadruplets = new ArrayList<>();
        Map<Integer, List<Integer[]>> sums = new HashMap<>();

        for (int n = 1; n < array.length; n++) {

            // Move forward summing two numbers and checking if the difference between the targetSum - currSum is on the hashmap
            for (int n2 = n+1; n2 < array.length; n2++) {
                int currSum = array[n] + array[n2];
                int diff = targetSum - currSum;
                if (sums.containsKey(diff)) {
                    List<Integer[]> pairs = sums.get(diff);
                    for (Integer[] pair: pairs) {
                        quadruplets.add(new Integer[] { pair[0], pair[1], array[n], array[n2] });
                    }
                }
            }

            // Move backwards summing the current number + the previous and inserting into the hashmap
            // This is to avoid duplicating elements
            for (int prev = n-1; prev >= 0; prev--) {
                int currSum = array[prev] + array[n];

                List<Integer[]> pairs = sums.getOrDefault(currSum, new ArrayList<>());
                Integer[] newPair = new Integer[] {array[prev], array[n]};
                pairs.add(newPair);
                sums.put(currSum, pairs);
            }
        }
        return quadruplets;
    }
}
