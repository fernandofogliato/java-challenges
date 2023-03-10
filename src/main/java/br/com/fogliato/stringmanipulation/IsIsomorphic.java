package br.com.fogliato.stringmanipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/isomorphic-strings
public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> charactersMappedBefore = new HashSet<>(t.length());

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);

            boolean isMappedAlready = map.containsKey(s1);
            if (isMappedAlready && map.get(s1) != s2) {
                return false;
            }

            if (!isMappedAlready && charactersMappedBefore.contains(s2)) {
                return false;
            }
            map.put(s1, s2);
            charactersMappedBefore.add(s2);
        }
        return true;
    }
}
