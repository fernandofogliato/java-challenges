package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumWaitingTimeTest {

    @Test
    public void case1() {
        int[] queries = {3, 2, 1, 2, 6};
        assertThat(new MinimumWaitingTime().minimumWaitingTime(queries)).isEqualTo(17);
    }

    @Test
    public void case2() {
        int[] queries = {2};
        assertThat(new MinimumWaitingTime().minimumWaitingTime(queries)).isEqualTo(0);
    }
}