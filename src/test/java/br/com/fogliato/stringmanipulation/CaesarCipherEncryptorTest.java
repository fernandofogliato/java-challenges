package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CaesarCipherEncryptorTest {

    @Test
    public void case1() {
        String value = "xyz";
        assertThat(CaesarCipherEncryptor.caesarCypherEncryptor(value, 2)).isEqualTo("zab");
    }

    @Test
    public void case2() {
        String value = "abc";
        assertThat(CaesarCipherEncryptor.caesarCypherEncryptor(value, 52)).isEqualTo("abc");
    }

    @Test
    public void case3() {
        String value = "abc";
        assertThat(CaesarCipherEncryptor.caesarCypherEncryptor(value, 57)).isEqualTo("def");
    }
}