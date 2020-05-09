package br.com.fogliato.stringmanipulation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/alternating-characters
public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        if (s.length() == 1) return 0;
        String result = s.replaceAll("A{2,}|B{2,}", "x");
        return s.length() - result.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
