package br.com.fogliato.heap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LastStoneWeightTest {

    @Test
    public void case1() {
        int[] stones = new int[] { 2,7,4,1,8,1 };
        Assertions.assertThat(new LastStoneWeight().lastStoneWeight(stones)).isEqualTo(1);
    }

    @Test
    public void case2() {
        int[] stones = new int[] { 5,8,8,8,9 };
        Assertions.assertThat(new LastStoneWeight().lastStoneWeight(stones)).isEqualTo(4);
    }
}