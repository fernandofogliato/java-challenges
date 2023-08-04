package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeOverlappingIntervalsTest {

    @Test
    public void case1() {
        int[][] intervals = new int[][] {
                new int[]{ 1, 2 },
                new int[]{ 3, 5},
                new int[]{ 4, 7},
                new int[]{ 6, 8},
                new int[]{ 9, 10}
        };
        assertThat(MergeOverlappingIntervals.mergeOverlappingIntervals(intervals))
                .containsExactly(new int[] { 1, 2 }, new int[] { 3, 8 }, new int[] { 9, 10 });
    }

    @Test
    public void case2() {
        int[][] intervals = new int[][] {
                new int[]{ 100, 105 },
                new int[]{ 1, 104 }
        };
        assertThat(MergeOverlappingIntervals.mergeOverlappingIntervals(intervals))
                .containsExactly(new int[] { 1, 105 });
    }
}