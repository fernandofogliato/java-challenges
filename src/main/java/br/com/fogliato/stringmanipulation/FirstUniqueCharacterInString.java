package br.com.fogliato.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {

        Map<Character, Integer> frequency = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
