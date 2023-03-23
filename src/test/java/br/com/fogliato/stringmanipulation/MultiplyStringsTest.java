package br.com.fogliato.stringmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplyStringsTest {

    @Test
    public void case1() {
        String num1 = "2";
        String num2 = "3";

        Assertions.assertThat(new MultiplyStrings().multiply(num1, num2)).isEqualTo("6");
    }

    @Test
    public void case2() {
        String num1 = "123";
        String num2 = "456";

        Assertions.assertThat(new MultiplyStrings().multiply(num1, num2)).isEqualTo("56088");
    }

    @Test
    public void case3() {
        String num1 = "123456789";
        String num2 = "987654321";

        Assertions.assertThat(new MultiplyStrings().multiply(num1, num2)).isEqualTo("121932631112635269");
    }

    @Test
    public void case4() {
        String num1 = "498828660196";
        String num2 = "840477629533";

        Assertions.assertThat(new MultiplyStrings().multiply(num1, num2)).isEqualTo("419254329864656431168468");
    }
}