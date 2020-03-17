package br.com.fogliato.stringmanipulation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/ctci-making-anagrams
public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        return 0;
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
