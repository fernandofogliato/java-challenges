package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NextGreaterElementTest {

    @Test
    public void case1() {
        int[] array = new int[] { 2, 5, -3, -4, 6, 7, 2 };
        assertThat(NextGreaterElement.nextGreaterElement(array)).containsExactly(5, 6, 6, 6, 7, -1, 5);
    }
}