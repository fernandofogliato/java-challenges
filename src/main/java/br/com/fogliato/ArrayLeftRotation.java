package br.com.fogliato;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation
public class ArrayLeftRotation {

    static int[] rotLeft(int[] a, int d) {
        if (d == a.length) {
            return a;
        }

        if (d < a.length) {
            int[] range = Arrays.copyOfRange(a, 0, d);
            int[] rest = Arrays.copyOfRange(a, d, a.length);
            return IntStream.concat(Arrays.stream(rest), Arrays.stream(range)).toArray();
        }
        return null;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
