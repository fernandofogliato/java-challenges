package br.com.fogliato.stringmanipulation;

import java.util.*;

// https://www.algoexpert.io/questions/common-characters
public class CommonCharacters {

    public static String[] commonCharacters(String[] strings) {
        Map<Character, Integer> commonCharacters = new HashMap<>();

        List<String> result = new ArrayList<>();
        for (String s : strings) {
            Set<Character> seen = new HashSet<>(s.length());
            for (int j = 0; j < s.length(); j++) {
                char letter = s.charAt(j);

                if (seen.contains(letter)) {
                    continue;
                }
                seen.add(letter);
                int count = commonCharacters.getOrDefault(letter, 0) + 1;
                commonCharacters.put(letter, count);
                if (count == strings.length) {
                    result.add(letter+"");
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
