package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstDuplicateValueTest {

    @Test
    public void case1() {
        int[] array = new int[] {2, 1, 5, 2, 3, 3, 4};
        assertThat(FirstDuplicateValue.firstDuplicateValue(array)).isEqualTo(2);
    }

    @Test
    public void case2() {
        int[] array = new int[] {2, 1, 5, 3, 3, 2, 4};
        assertThat(FirstDuplicateValue.firstDuplicateValue(array)).isEqualTo(3);
    }
}