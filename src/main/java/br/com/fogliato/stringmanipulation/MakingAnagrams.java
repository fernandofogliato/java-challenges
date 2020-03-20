package br.com.fogliato.stringmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/ctci-making-anagrams
public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        if (a.equals(b)) {
            return 0;
        }

        Map<Character, Integer> visitedIndexes = new HashMap<>();

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char charToFind = a.charAt(i);

            Integer lastIndex = visitedIndexes.get(charToFind);
            int index;
            if (Objects.nonNull(lastIndex)) {
                index = b.indexOf(charToFind, lastIndex+1);
            } else {
                index = b.indexOf(charToFind);
            }

            if (index > -1) {
                visitedIndexes.put(charToFind, index);
                count++;
            }
        }

        return a.length() + b.length() - (count * 2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println(res);
        scanner.close();
    }
}
