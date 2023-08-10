package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SweetAndSavoryTest {

    @Test
    public void case1() {
        int[] dishes = new int[] { 5, 2, -7, 30, 12, -4, -20};
        int target = 4;
        assertThat(SweetAndSavory.sweetAndSavory(dishes, target)).containsExactly(-4, 5);
    }

    @Test
    public void case2() {
        int[] dishes = new int[] { -5, 10 };
        int target = 5;
        assertThat(SweetAndSavory.sweetAndSavory(dishes, target)).containsExactly(-5, 10);
    }
}