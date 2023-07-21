package br.com.fogliato.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

// https://www.algoexpert.io/questions/generate-document
public class GenerateDocument {

    // O(n + m) time, O(c) space
    // N is the number of characters, m is the length of the document and c is the number of unique characters
    // in the characters string
    public static boolean generateDocument(String characters, String document) {
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();

        for (int i = 0; i < characters.length(); i++) {
            char c = characters.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < document.length(); i++) {
            char c = document.charAt(i);
            int count = frequency.getOrDefault(c, 0);
            if (count <= 0) {
                return false;
            }
            frequency.put(c, count-1);
        }
        return true;
    }
}
