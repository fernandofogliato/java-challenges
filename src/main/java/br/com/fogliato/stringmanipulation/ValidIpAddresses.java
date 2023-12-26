package br.com.fogliato.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/valid-ip-addresses
public class ValidIpAddresses {

    // O(1) time | O(1) space
    public static List<String> validIPAddresses(String string) {
        List<String> validIPs = new ArrayList<>();

        String[] currentIPParts = new String[4];

        // First part
        for (int i = 1; i < Math.min(string.length(), 4); i++) {
            currentIPParts[0] = string.substring(0, i);
            if (!isValidPart(currentIPParts[0])) {
                continue;
            }

            // Second part
            for (int j = i + 1; j < i + Math.min(string.length() - i, 4); j++) {
                currentIPParts[1] = string.substring(i, j);
                if (!isValidPart(currentIPParts[1])) {
                    continue;
                }

                // Third and Fourth parts
                for (int k = j + 1; k < j + Math.min(string.length() - j, 4); k++) {
                    currentIPParts[2] = string.substring(j, k);
                    currentIPParts[3] = string.substring(k);
                    if (isValidPart(currentIPParts[2]) && isValidPart(currentIPParts[3])) {
                        validIPs.add(String.join(".", currentIPParts));
                    }
                }
            }
        }

        return validIPs;
    }

    private static boolean isValidPart(String part) {
        Integer value = Integer.parseInt(part);
        if (value > 255) {
            return false;
        }
        // To skip leading zeros
        return value.toString().length() == part.length();
    }
}
