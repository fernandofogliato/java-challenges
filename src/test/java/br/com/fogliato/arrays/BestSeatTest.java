package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestSeatTest {

    @Test
    public void case1() {
        int[] seats = new int[] { 1, 0, 1, 0, 0, 0, 1};
        assertThat(BestSeat.bestSeat(seats)).isEqualTo(4);
    }

    @Test
    public void case2() {
        int[] seats = new int[] { 1, 0, 0, 1, 0, 0, 1 };
        assertThat(BestSeat.bestSeat(seats)).isEqualTo(1);
    }
}