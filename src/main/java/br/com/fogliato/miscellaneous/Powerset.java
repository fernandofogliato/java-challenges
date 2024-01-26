package br.com.fogliato.miscellaneous;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/powerset
public class Powerset {

    // O(n*2^n) time | O(n*2^n) space - where n is the length of the input array
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // Empty array

        for (int val : array) {
            int subsetSize = subsets.size();
            for (int i = 0; i < subsetSize; i++) {
                List<Integer> currentSet = subsets.get(i);
                List<Integer> set = new ArrayList<>(currentSet);
                set.add(val);
                subsets.add(set);
            }
        }
        return subsets;
    }
}
