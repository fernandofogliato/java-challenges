package br.com.fogliato.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

        Map<Character, Integer> counterS = new HashMap<>(s.length());
        Map<Character, Integer> counterT = new HashMap<>(t.length());
        
        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            counterS.put(cS, counterS.getOrDefault(cS, 0) + 1);
            counterT.put(cT, counterT.getOrDefault(cT, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: counterS.entrySet()) {
            if (!entry.getValue().equals(counterT.getOrDefault(entry.getKey(), 0))) {
                return false;
            }
        }
        return true;
    }
}
