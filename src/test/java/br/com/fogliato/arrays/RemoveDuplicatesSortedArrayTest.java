package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesSortedArrayTest {

    @Test
    public void case1() {
        int[] nums = {1,1,2};
        assertThat(new RemoveDuplicatesSortedArray().removeDuplicates(nums)).isEqualTo(2);
    }

    @Test
    public void case2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        assertThat(new RemoveDuplicatesSortedArray().removeDuplicates(nums)).isEqualTo(5);
    }
}