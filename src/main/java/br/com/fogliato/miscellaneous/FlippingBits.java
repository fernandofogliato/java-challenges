package br.com.fogliato.miscellaneous;

import java.io.IOException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/flipping-bits
public class FlippingBits {

    private static final String BINARY_32 = "00000000000000000000000000000000";

    static long flippingBits(long n) {
        String binary = Long.toBinaryString(n);

        String result = BINARY_32.substring(0, 32 - binary.length())
                .concat(binary)
                .replace("0", "x")
                .replace("1", "0")
                .replace("x", "1");

        return Long.parseLong(result, 2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            System.out.println(result);
        }
        scanner.close();
    }
}
