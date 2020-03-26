package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlippingBitsTest {

    @Test
    void flippingBits_n9() {
        long result = FlippingBits.flippingBits(9);
        assertThat(result).isEqualTo(4294967286L);
    }

    @Test
    void flippingBits_n1() {
        long result = FlippingBits.flippingBits(1);
        assertThat(result).isEqualTo(4294967294L);
    }

    @Test
    void flippingBits_n2147483647() {
        long result = FlippingBits.flippingBits(2147483647);
        assertThat(result).isEqualTo(2147483648L);
    }
}
