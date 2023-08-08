package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MissingNumbersTest {

    @Test
    public void case1() {
        int[] nums = new int[] { 1 };
        assertThat(MissingNumbers.missingNumbers(nums)).containsExactly(2, 3);
    }

    @Test
    public void case2() {
        int[] nums = new int[] { 1, 4, 3 };
        assertThat(MissingNumbers.missingNumbers(nums)).containsExactly(2, 5);
    }
}