package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StableInternshipsTest {

    @Test
    public void case1() {
        int[][] interns = new int[][] {{0, 1}, {1, 0}};
        int[][] teams = new int[][] {{0, 1}, {1, 0}};
        assertThat(StableInternships.stableInternships(interns, teams)).containsExactly(new int[]{0, 0}, new int[]{1, 1});
    }

    @Test
    public void case2() {
        int[][] interns = new int[][] {{1, 0}, {0, 1}};
        int[][] teams = new int[][] {{0, 1}, {1, 0}};
        assertThat(StableInternships.stableInternships(interns, teams)).containsExactly(new int[]{0, 1}, new int[]{1, 0});
    }

    @Test
    public void case3() {
        int[][] interns = new int[][] {{0, 1, 2, 3}, {2, 1, 3, 0}, {0, 2, 3, 1}, {3, 1, 0, 2}};
        int[][] teams = new int[][] {{1, 3, 2, 0}, {0, 1, 2, 3}, {1, 2, 3, 0}, {3, 0, 2, 1}};
        assertThat(StableInternships.stableInternships(interns, teams)).contains(
                new int[]{0, 1}, new int[]{1, 2}, new int[]{2, 0}, new int[]{3, 3});
    }
}