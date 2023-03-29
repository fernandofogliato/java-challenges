package br.com.fogliato.miscellaneous;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RichestCustomerWealthTest {

    @Test
    public void case1() {
        int[][] accounts = {{ 1,2,3 }, { 3,2,1 }};
        assertThat(new RichestCustomerWealth().maximumWealth(accounts)).isEqualTo(6);
    }

    @Test
    public void case2() {
        int[][] accounts = {{ 1,5 }, { 7,3 }, { 3,5 }};
        assertThat(new RichestCustomerWealth().maximumWealth(accounts)).isEqualTo(10);
    }

    @Test
    public void case3() {
        int[][] accounts = {{ 2,8,7 }, { 7,1,3 }, { 1,9,5 }};
        assertThat(new RichestCustomerWealth().maximumWealth(accounts)).isEqualTo(17);
    }
}