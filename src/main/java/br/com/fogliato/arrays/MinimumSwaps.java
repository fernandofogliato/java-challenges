package br.com.fogliato.arrays;

import java.io.IOException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/minimum-swaps-2
public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int swap(int[] arr, int begin, int end) {
        int swaps = 0;
        for (int i = begin; i <= end; i++) {
            if (arr[i] > arr[end]) {
                swapPositions(arr, i, end);
                swaps++;
            }
        }
        return swaps;
    }

    static void swapPositions(int[] arr, int posA, int posB) {
        int aux = arr[posB];
        arr[posB] = arr[posA];
        arr[posA] = aux;
    }

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int mid = arr.length/2;
        swaps += swap(arr, 0, mid);
        swaps += swap(arr, mid, arr.length-1);
        return swaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(res);
        scanner.close();
    }
}
