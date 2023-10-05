package br.com.fogliato.stringmanipulation;

// https://www.algoexpert.io/questions/levenshtein-distance
public class LevenshteinDistance {

    public static int levenshteinDistance(String str1, String str2) {
        String small;
        String big;

        if (str1.length() > str2.length()) {
            small = str2;
            big = str1;
        } else {
            small = str1;
            big = str2;
        }

        int[] evenRow = new int[small.length()+1];
        int[] oddRow = new int[small.length()+1];

        for (int i = 0; i < evenRow.length; i++) {
            evenRow[i] = i;
        }

        for (int i = 1;  i <= big.length(); i++) {
            int[] currentEdits;
            int[] previousEdits;
            if (i % 2 == 1) {
                currentEdits = oddRow;
                previousEdits = evenRow;
            } else {
                currentEdits = evenRow;
                previousEdits = oddRow;
            }
            currentEdits[0] = i;
            for (int j = 1; j <= small.length(); j++) {
                char c1 = big.charAt(i-1);
                char c2 = small.charAt(j-1);
                if (c1 == c2) {
                    currentEdits[j] = previousEdits[j-1];
                } else {
                    currentEdits[j] = 1 + Math.min(Math.min(previousEdits[j-1], previousEdits[j]), currentEdits[j-1]);
                }
            }
        }
        return big.length() % 2 == 0 ? evenRow[evenRow.length-1] : oddRow[evenRow.length-1];
    }
}
