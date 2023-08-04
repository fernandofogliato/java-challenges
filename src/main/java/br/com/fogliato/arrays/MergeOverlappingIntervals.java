package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://www.algoexpert.io/questions/merge-overlapping-intervals
public class MergeOverlappingIntervals {

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);
        for (int[] currentInterval : intervals) {
            int[] lastInterval = mergedIntervals.get(mergedIntervals.size() - 1);
            if (lastInterval[1] >= currentInterval[0]) {
                lastInterval[1] = Math.max(lastInterval[1], currentInterval[1]);
            } else {
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[0][0]);
    }
}
