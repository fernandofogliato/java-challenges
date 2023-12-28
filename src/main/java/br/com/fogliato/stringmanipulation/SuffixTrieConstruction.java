package br.com.fogliato.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

// https://www.algoexpert.io/questions/suffix-trie-construction
public class SuffixTrieConstruction {
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        // O(n²) time | O(n²) space - where n is the length of the input string
        public void populateSuffixTrieFrom(String str) {
            for (int i = 0; i < str.length(); i++) {
                TrieNode current = root;
                for (int j = i; j < str.length(); j++) {
                    Character letter = str.charAt(j);
                    TrieNode node = current.children.getOrDefault(letter, new TrieNode());
                    current.children.put(letter, node);
                    current = node;
                }
                current.children.put(endSymbol, null);
            }
        }

        // O(m) time | O(1) space - where m is the length of the input string
        public boolean contains(String str) {
            TrieNode current = root;
            for (Character letter: str.toCharArray()) {
                if (!current.children.containsKey(letter)) {
                    return false;
                }
                current = current.children.get(letter);
            }
            return current.children.containsKey(endSymbol);
        }
    }
}
