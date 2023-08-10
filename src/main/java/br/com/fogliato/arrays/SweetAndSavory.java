package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.algoexpert.io/questions/sweet-and-savory
public class SweetAndSavory {

    // Time O(n log n) Because of the sorting
    // Space O(n)
    public static int[] sweetAndSavory(int[] dishes, int target) {
        Arrays.sort(dishes); // n log n

        List<Integer> sweetDishes = new ArrayList<>();
        List<Integer> savoryDishes = new ArrayList<>();

        for (int dish : dishes) {
            if (dish > 0) {
                savoryDishes.add(dish);
            } else {
                sweetDishes.add(dish);
            }
        }

        int[] bestPair = new int[2];
        int bestDifference = Integer.MIN_VALUE;

        int idxSweet = sweetDishes.size()-1;
        int idxSavory = 0;

        while (idxSweet >= 0 && idxSavory < savoryDishes.size()) {
            int currentSum = sweetDishes.get(idxSweet) + savoryDishes.get(idxSavory);

            if (currentSum > bestDifference && currentSum <= target) {
                bestDifference = currentSum;
                bestPair[0] = sweetDishes.get(idxSweet);
                bestPair[1] = savoryDishes.get(idxSavory);
            }

            if (currentSum < target) {
                idxSavory++;
            } else {
                idxSweet--;
            }
        }

        return bestPair;
    }
}
