package br.com.fogliato.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HouseRobberTest {

    @Test
    public void case1() {
        int[] nums = {1,2,3,1};
        assertThat(new HouseRobber().rob(nums)).isEqualTo(4);
    }

    @Test
    public void case2() {
        int[] nums = {2,7,9,3,1};
        assertThat(new HouseRobber().rob(nums)).isEqualTo(12);
    }
}