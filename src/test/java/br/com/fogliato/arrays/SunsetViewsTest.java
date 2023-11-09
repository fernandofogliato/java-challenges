package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SunsetViewsTest {

    @Test
    public void case1() {
        int[] buildings = { 3, 5, 4, 4, 3, 1, 3, 2 };
        String direction = "EAST";
        assertThat(SunsetViews.sunsetViews(buildings, direction)).containsExactly(1, 3, 6, 7);
    }

    @Test
    public void case2() {
        int[] buildings = { 3, 5, 4, 4, 3, 1, 3, 2 };
        String direction = "WEST";
        assertThat(SunsetViews.sunsetViews(buildings, direction)).containsExactly(0, 1);
    }
}