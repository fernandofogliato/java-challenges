package br.com.fogliato.stringmanipulation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInStringTest {

    @Test
    public void case1() {
        String s = "leetcode";
        Assertions.assertThat(new FirstUniqueCharacterInString().firstUniqChar(s)).isZero();
    }

    @Test
    public void case2() {
        String s = "loveleetcode";
        Assertions.assertThat(new FirstUniqueCharacterInString().firstUniqChar(s)).isEqualTo(2);
    }

    @Test
    public void case3() {
        String s = "aabb";
        Assertions.assertThat(new FirstUniqueCharacterInString().firstUniqChar(s)).isEqualTo(-1);
    }
}