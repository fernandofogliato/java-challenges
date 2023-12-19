package br.com.fogliato.stringmanipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.algoexpert.io/questions/minimum-characters-for-words
public class MinimumCharactersForWords {

    // O(n * l) time | O(c) space - where n is the number of words, l is the length of the longest word,
    // and c is the number of unique characters across all words.
    public static char[] minimumCharactersForWords(String[] words) {
        Map<Character, Integer> maximumFrequencies = new HashMap<>();

        // Count the frequency of characters in each word, then update the global frequency counter.
        for (String word : words) {
            Map<Character, Integer> characterFrequencies = getCharacterFrequenciesInWord(word);
            updateMaximumFrequencies(maximumFrequencies, characterFrequencies);
        }

        // Build the result repeating the characters needed
        List<Character> minimumChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : maximumFrequencies.entrySet()) {
            // For example in the word 'that' we need 2 't' to be able to build this word, so that's why we need to iterate
            // over the frequencies and repeat the characters needed.
            for (int i = 0; i < entry.getValue(); i++) {
                minimumChars.add(entry.getKey());
            }
        }

        // Convert from ArrayList to Array
        char[] result = new char[minimumChars.size()];
        for (int i = 0; i < minimumChars.size(); i++) {
            result[i] = minimumChars.get(i);
        }
        return result;
    }

    private static void updateMaximumFrequencies(Map<Character, Integer> maximumFrequencies, Map<Character, Integer> characterFrequencies) {
        characterFrequencies.forEach((k, v) -> {
            Integer count = Math.max(v, maximumFrequencies.getOrDefault(k, 0));
            maximumFrequencies.put(k, count);
        });
    }

    private static Map<Character, Integer> getCharacterFrequenciesInWord(String word) {
        Map<Character, Integer> characterFrequencies = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char val = word.charAt(i);

            Integer count = characterFrequencies.getOrDefault(val, 0) + 1;
            characterFrequencies.put(val, count);
        }
        return characterFrequencies;
    }

}
