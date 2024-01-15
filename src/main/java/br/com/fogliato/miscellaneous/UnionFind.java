package br.com.fogliato.miscellaneous;

import java.util.HashMap;
import java.util.Map;

// https://www.algoexpert.io/questions/union-find
public class UnionFind {

    Map<Integer, Integer> parents = new HashMap<>();

    // O(1) time | O(1) space
    public void createSet(int value) {
        parents.put(value, value);
    }

    // O(alpha(n)) time where aplha is the inverse Ackermann function | O(n) space - where n is the number of elements
    public Integer find(int value) {
        if (!parents.containsKey(value)) {
            return null;
        }

        int parent = value;
        while (parent != parents.get(parent)) {
            parent = parents.get(parent);
        }

        int mainParent = parent;
        parent = value;
        while (parents.get(parent) != mainParent) {
            int next = parents.get(parent);
            parents.put(parent, mainParent);
            parent = next;
        }
        return mainParent;
    }

    // O(n) time | O(1) space
    public void union(int valueOne, int valueTwo) {
        if (!parents.containsKey(valueOne) || !parents.containsKey(valueTwo)) {
            return;
        }

        int valueOneRoot = find(valueOne);
        int valueTwoRoot = find(valueTwo);
        parents.put(valueTwoRoot, valueOneRoot);
    }
}
