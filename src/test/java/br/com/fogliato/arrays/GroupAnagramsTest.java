package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {

    @Test
    public void case1() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = new ArrayList<>();
        result.add(Arrays.asList("bat"));
        result.add(Arrays.asList("tan", "nat"));
        result.add(Arrays.asList("eat", "tea", "ate"));

        assertThat(new GroupAnagrams().groupAnagrams(strs)).hasSameElementsAs(result);
    }

    @Test
    public void case2() {
        String[] strs = {""};
        List<List<String>> result = new ArrayList<>();
        result.add(Arrays.asList(""));

        assertThat(new GroupAnagrams().groupAnagrams(strs)).hasSameElementsAs(result);
    }

    @Test
    public void case3() {
        String[] strs = {"a"};
        List<List<String>> result = new ArrayList<>();
        result.add(Arrays.asList("a"));

        assertThat(new GroupAnagrams().groupAnagrams(strs)).hasSameElementsAs(result);
    }
}