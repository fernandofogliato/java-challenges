package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class OptimalFreeLancingTest {

    @Test
    public void case1() {
        Map<String, Integer>[] jobs = new Map[0];
        assertThat(new OptimalFreeLancing().optimalFreelancing(jobs)).isEqualTo(0);
    }

    @Test
    public void case2() {
        Map<String, Integer>[] jobs = new Map[1];
        jobs[0] = new HashMap<>();
        jobs[0].put("deadline", 1);
        jobs[0].put("payment", 1);
        assertThat(new OptimalFreeLancing().optimalFreelancing(jobs)).isEqualTo(1);
    }

    @Test
    public void case3() {
        Map<String, Integer>[] jobs = new Map[2];
        jobs[0] = new HashMap<>();
        jobs[0].put("deadline", 1);
        jobs[0].put("payment", 2);

        jobs[1] = new HashMap<>();
        jobs[1].put("deadline", 1);
        jobs[1].put("payment", 1);
        assertThat(new OptimalFreeLancing().optimalFreelancing(jobs)).isEqualTo(2);
    }
}