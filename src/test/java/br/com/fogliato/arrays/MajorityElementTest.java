package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MajorityElementTest {

    @Test
    public void case1() {
        int[] array = new int[] { 1, 2, 3, 2, 3, 2, 2, 4, 2 };
        assertThat(MajorityElement.majorityElement(array)).isEqualTo(2);
    }

    @Test
    public void case2() {
        int[] array = new int[] { 1, 1, 1, 1, 1, 1, 1 };
        assertThat(MajorityElement.majorityElement(array)).isEqualTo(1);
    }

    @Test
    public void case3() {
        int[] array = new int[] { 2 };
        assertThat(MajorityElement.majorityElement(array)).isEqualTo(2);
    }
}