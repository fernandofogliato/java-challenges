package br.com.fogliato;

import java.io.IOException;
import java.util.*;

public class PairsOfShoes {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> colors = new HashSet<>();
        int pairsOfSocks = 0;

        for (int color: ar) {
            if (colors.contains(color)) {
                pairsOfSocks++;
                colors.remove(color);
            } else {
                colors.add(color);
            }
        }
        return pairsOfSocks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);
        scanner.close();
    }
}
