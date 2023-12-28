package br.com.fogliato.stringmanipulation;

import java.util.*;

// https://www.algoexpert.io/questions/group-anagrams
public class GroupAnagrams {

    // O(w * n * log(n)) time | O(wn) space - where w is the number of words and n is the length of the longest word
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word: words) {
            char[] tempArray = word.toCharArray();
            Arrays.sort(tempArray);
            String sortedString = new String(tempArray);

            List<String> group = groups.getOrDefault(sortedString, new ArrayList<String>());
            group.add(word);
            groups.put(sortedString, group);
        }

        List<List<String>> result = new ArrayList<>();
        groups.forEach((k,v) -> result.add(v));
        return result;
    }
}
