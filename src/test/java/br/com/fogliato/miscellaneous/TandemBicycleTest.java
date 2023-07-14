package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// https://www.algoexpert.io/questions/tandem-bicycle
class TandemBicycleTest {

    @Test
    public void case1() {
        int[] redShirtSpeeds = { 5, 5, 3, 9, 2 };
        int[] blueShirtSpeeds = { 3, 6, 7, 2, 1 };
        boolean fastest = true;
        assertThat(new TandemBicycle().tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest)).isEqualTo(32);
    }

    @Test
    public void case2() {
        int[] redShirtSpeeds = { 5, 5, 3, 9, 2 };
        int[] blueShirtSpeeds = { 3, 6, 7, 2, 1 };
        boolean fastest = false;
        assertThat(new TandemBicycle().tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest)).isEqualTo(25);
    }
}