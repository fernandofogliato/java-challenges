package br.com.fogliato.stringmanipulation;

import java.util.*;

// https://www.algoexpert.io/questions/phone-number-mnemonics
public class PhoneNumberMnemonics {

    private final Map<Character, List<Character>> keymap = new HashMap<>();

    PhoneNumberMnemonics() {
        keymap.put('0', Arrays.asList('0'));
        keymap.put('1', Arrays.asList('1'));
        keymap.put('2', Arrays.asList('a', 'b', 'c'));
        keymap.put('3', Arrays.asList('d', 'e', 'f'));
        keymap.put('4', Arrays.asList('g', 'h', 'i'));
        keymap.put('5', Arrays.asList('j', 'k', 'l'));
        keymap.put('6', Arrays.asList('m', 'n', 'o'));
        keymap.put('7', Arrays.asList('p', 'q', 'r', 's'));
        keymap.put('8', Arrays.asList('t', 'u', 'v'));
        keymap.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    public List<String> phoneNumberMnemonics(String phoneNumber) {
        List<String> mnemonics = new ArrayList<>();
        char[] currentMnemonic = new char[phoneNumber.length()];
        combineLetters(0, phoneNumber, currentMnemonic, mnemonics);
        return mnemonics;
    }

    private void combineLetters(int index, String phoneNumber, char[] currentMnemonic, List<String> mnemonics) {
        if (index == phoneNumber.length()) {
            StringBuilder sb = new StringBuilder();
            for (char val : currentMnemonic) {
                sb.append(val);
            }
            mnemonics.add(sb.toString());
            return;
        }

        char digit = phoneNumber.charAt(index);
        List<Character> letters = keymap.get(digit);

        for (Character letter: letters) {
            currentMnemonic[index] = letter;
            combineLetters(index+1, phoneNumber, currentMnemonic, mnemonics);
        }
    }
}
