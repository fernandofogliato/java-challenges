package br.com.fogliato.stringmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateDocumentTest {

    @Test
    public void case1() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        assertThat(GenerateDocument.generateDocument(characters, document)).isTrue();
    }

    @Test
    public void case2() {
        String characters = "A";
        String document = "a";
        assertThat(GenerateDocument.generateDocument(characters, document)).isFalse();
    }
}