package br.com.fogliato.stringmanipulation;

// https://www.algoexpert.io/questions/caesar-cipher-encryptor
public class CaesarCipherEncryptor {

    // O(n) time | O(n) space
    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char newChar = str.charAt(i);
            newChar += (key % 26); // to avoid big numbers

            // If new char is greater than Z it needs to start counting from A again
            if (newChar > 122) {
                newChar %= 122; // 122 = z

                // Since 97 is a, we need to use 96 to add the remainder of the above calculation.
                // If we use 97 it would be adding one extra movement which would be incorrect
                newChar += 96;
            }
            sb.append(newChar);
        }
        return sb.toString();
    }
}
