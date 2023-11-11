package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneNumberMnemonicsTest {

    @Test
    public void case1() {
        String phoneNumber = "1905";
        List<String> mnemonics = new PhoneNumberMnemonics().phoneNumberMnemonics(phoneNumber);
        assertThat(mnemonics).containsExactly(
            "1w0j",
            "1w0k",
            "1w0l",
            "1x0j",
            "1x0k",
            "1x0l",
            "1y0j",
            "1y0k",
            "1y0l",
            "1z0j",
            "1z0k",
            "1z0l");
    }
}