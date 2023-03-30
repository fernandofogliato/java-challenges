package br.com.fogliato.miscellaneous;

import java.util.HashMap;

public class RansonNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        var frequency = new HashMap<Character, Integer>(26);
        for (int i = 0; i < magazine.length(); i++) {
            var c = magazine.charAt(i);
            var frequencyOrDefault = frequency.getOrDefault(c, 0);
            if (frequencyOrDefault == 0) {
                frequency.put(c, 1);
            } else {
                frequency.put(c, ++frequencyOrDefault);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            var c = ransomNote.charAt(i);
            var count = frequency.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            frequency.put(c, --count);
        }
        return true;
    }
}
