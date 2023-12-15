package br.com.fogliato.miscellaneous;

import java.util.*;

// https://www.algoexpert.io/questions/task-assignment
public class TaskAssignment {

    // O(nlog(n)) time | O(n) space - where n is the number of tasks
    public static List<List<Integer>> taskAssignment(int k, List<Integer> tasks) {

        // Map to keep track of the indices before sorting the input array
        Map<Integer, Stack<Integer>> mapValueToIndexes = new HashMap<>();
        for (int i = 0; i < tasks.size(); i++) {
            Integer time = tasks.get(i);
            Stack<Integer> indexes = mapValueToIndexes.getOrDefault(time, new Stack<>());
            indexes.add(i);
            mapValueToIndexes.put(time, indexes);
        }

        // Sort the array
        Collections.sort(tasks);

        List<List<Integer>> pairs = new ArrayList<>();
        int firstTask = 0;
        int lastTask = tasks.size()-1;

        // Combine the shortest task with the longest one
        while (pairs.size() < k) {
            List<Integer> pair = new ArrayList<>();

            int firstTaskIdx = mapValueToIndexes.get(tasks.get(firstTask)).pop();
            int lastTaskIdx = mapValueToIndexes.get(tasks.get(lastTask)).pop();

            pair.add(firstTaskIdx);
            pair.add(lastTaskIdx);

            pairs.add(pair);

            firstTask++;
            lastTask--;
        }

        return pairs;
    }
}
