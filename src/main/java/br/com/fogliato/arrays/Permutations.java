package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/permutations
public class Permutations {

    private Permutations() {

    }

    // O(n*n!) time | O(n*n!) space - where n is the length of the input array
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (!array.isEmpty()) {
            helper(0, array, permutations);
        }
        return permutations;
    }

    private static void helper(int i, List<Integer> array, List<List<Integer>> permutations) {
        if (i == array.size()) {
            List<Integer> permutation = new ArrayList<>(array);
            permutations.add(permutation);
            return;
        }

        for (int j = i; j < array.size(); j++) {
            swap(i, j, array);
            helper(i+1, array, permutations);
            swap(i, j, array);
        }
    }

    private static void swap(int i, int j, List<Integer> array)  {
        int aux = array.get(i);
        array.set(i, array.get(j));
        array.set(j, aux);
    }
}
