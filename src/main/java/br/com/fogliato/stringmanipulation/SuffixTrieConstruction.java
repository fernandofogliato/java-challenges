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
                Character suffix = str.charAt(i);

                TrieNode topPointer = root.children.getOrDefault(suffix, new TrieNode());
                root.children.put(suffix, topPointer);

                TrieNode bottomPointer;
                for (Character letter : str.substring(i+1).toCharArray()) {
                    bottomPointer = topPointer.children.getOrDefault(letter, new TrieNode());
                    topPointer.children.put(letter, bottomPointer);
                    topPointer = bottomPointer;
                }
                topPointer.children.put(endSymbol, null);
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
