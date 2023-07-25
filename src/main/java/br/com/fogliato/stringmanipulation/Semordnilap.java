package br.com.fogliato.stringmanipulation;

import java.util.*;

// https://www.algoexpert.io/questions/semordnilap
public class Semordnilap {

    public static List<List<String>> semordnilap(String[] words) {
        List<List<String>> result = new ArrayList<>();
        Set<String> map = new HashSet<>();
        Collections.addAll(map, words);

        for (String word : words) {
            String wordReversed = new StringBuilder(word).reverse().toString();
            if (!word.equals(wordReversed) && map.contains(wordReversed)) {
                List<String> pair = new ArrayList<>();
                pair.add(word);
                pair.add(wordReversed);
                result.add(pair);
                map.remove(word);
                map.remove(wordReversed);
            }
        }

        return result;
    }
}
