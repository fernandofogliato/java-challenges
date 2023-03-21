package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    @Test
    public void case1() {
        int n = 2;
        assertThat(new ClimbingStairs().climbStairs(n)).isEqualTo(2);
    }

    @Test
    public void case2() {
        int n = 3;
        assertThat(new ClimbingStairs().climbStairs(n)).isEqualTo(3);
    }

    @Test
    public void case3() {
        int n = 1;
        assertThat(new ClimbingStairs().climbStairs(n)).isEqualTo(1);
    }
}