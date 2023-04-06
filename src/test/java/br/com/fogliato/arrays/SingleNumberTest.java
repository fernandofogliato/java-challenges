package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {

    @Test
    public void case1() {
        int[] nums = { 2, 2, 1 };
        assertThat(new SingleNumber().singleNumber(nums)).isEqualTo(1);
    }

    @Test
    public void case2() {
        int[] nums = { 4, 1, 2, 1, 2 };
        assertThat(new SingleNumber().singleNumber(nums)).isEqualTo(4);
    }

    @Test
    public void case3() {
        int[] nums = { 1 };
        assertThat(new SingleNumber().singleNumber(nums)).isEqualTo(1);
    }
}