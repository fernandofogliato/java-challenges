package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {

    @Test
    public void case1() {
        int[] digits = { 1, 2, 3 };
        assertThat(new PlusOne().plusOne(digits)).containsExactly(1,2,4);
    }

    @Test
    public void case2() {
        int[] digits = { 4, 3, 2, 1 };
        assertThat(new PlusOne().plusOne(digits)).containsExactly(4, 3, 2, 2);
    }

    @Test
    public void case3() {
        int[] digits = { 9 };
        assertThat(new PlusOne().plusOne(digits)).containsExactly(1,0);
    }

    @Test
    public void case4() {
        int[] digits = { 5, 6, 2, 0, 0, 4, 6, 2, 4, 9 };
        assertThat(new PlusOne().plusOne(digits)).containsExactly(5, 6, 2, 0, 0, 4, 6, 2, 5, 0);
    }

    @Test
    public void case5() {
        int[] digits = { 9, 9 };
        assertThat(new PlusOne().plusOne(digits)).containsExactly(1, 0, 0);
    }

    @Test
    public void case6() {
        int[] digits = { 9, 9, 9 };
        assertThat(new PlusOne().plusOne(digits)).containsExactly(1, 0, 0, 0);
    }

    @Test
    public void case7() {
        int[] digits = { 8, 9, 9, 9 };
        assertThat(new PlusOne().plusOne(digits)).containsExactly(9, 0, 0, 0);
    }
}