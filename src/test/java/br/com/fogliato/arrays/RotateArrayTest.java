package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {

    @Test
    public void case1() {
        int[] nums = { 1,2,3,4,5,6,7 };
        int k = 3;
        new RotateArray().rotate(nums, k);
        assertThat(nums).containsExactly(5,6,7,1,2,3,4);
    }

    @Test
    public void case2() {
        int[] nums = { -1,-100,3,99 };
        int k = 2;
        new RotateArray().rotate(nums, k);
        assertThat(nums).containsExactly(3,99,-1,-100);
    }
}