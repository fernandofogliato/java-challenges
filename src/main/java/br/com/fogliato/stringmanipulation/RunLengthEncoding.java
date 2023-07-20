package br.com.fogliato.stringmanipulation;

// https://www.algoexpert.io/questions/run-length-encoding
public class RunLengthEncoding {

    public static String runLengthEncoding(String string) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char current = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            char previous = string.charAt(i-1);
            current = string.charAt(i);
            if (count == 9 || previous != current) {
                sb.append(count).append(previous);
                count = 0;
            }
            count++;
        }
        sb.append(count).append(current);
        return sb.toString();
    }
}
