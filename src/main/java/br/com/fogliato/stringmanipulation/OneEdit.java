package br.com.fogliato.stringmanipulation;

// https://www.algoexpert.io/questions/one-edit
public class OneEdit {

    public static boolean oneEdit(String stringOne, String stringTwo) {
        int diffSize = Math.abs(stringOne.length() - stringTwo.length());
        if (diffSize > 1) {
            return false;
        }

        int idx = 0;
        int idx2 = 0;
        int totalEdits = 0;
        while (idx < stringOne.length() && idx2 < stringTwo.length()) {
            char s1 = stringOne.charAt(idx);
            char s2 = stringTwo.charAt(idx2);

            if (s1 == s2) {
                idx++;
                idx2++;
            } else {
                totalEdits++;
                if (stringOne.length() > stringTwo.length()) {
                    idx++;
                } else if (stringTwo.length() > stringOne.length()) {
                    idx2++;
                } else {
                    idx++;
                    idx2++;
                }
            }

            if (totalEdits > 1) {
                return false;
            }
        }
        return true;
    }
}
