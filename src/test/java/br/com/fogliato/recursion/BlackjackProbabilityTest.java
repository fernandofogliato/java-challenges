package br.com.fogliato.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BlackjackProbabilityTest {

    @Test
    void case1() {
        int target = 21;
        int startingHand = 15;
        assertThat(BlackjackProbability.blackjackProbability(target, startingHand)).isEqualTo(0.45f);
    }
}