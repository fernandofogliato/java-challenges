package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidIpAddressesTest {

    @Test
    public void case1() {
        String test = "1921680";
        assertThat(ValidIpAddresses.validIPAddresses(test))
                .contains("1.9.216.80", "1.92.16.80", "1.92.168.0", "19.2.16.80", "19.2.168.0", "19.21.6.80",
                          "19.21.68.0", "19.216.8.0", "192.1.6.80", "192.1.68.0", "192.16.8.0");
    }
}