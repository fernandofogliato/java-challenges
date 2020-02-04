package br.com.fogliato;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ContactsSolution {

    private static final HashMap<String, Integer> contacts = new HashMap<>();
    /*
     * Complete the contacts function below.
     */
    static void contacts(BufferedWriter bufferedWriter, String[][] queries) throws IOException {
        /*
         * Write your code here.
         */
        for (int queriesRowItr = 0; queriesRowItr < queries.length; queriesRowItr++) {
            String action = queries[queriesRowItr][0];
            String name = queries[queriesRowItr][1];

            if ("add".equals(action)) {
                for (int i = 1; i <= name.length(); i++) {
                    String substring = name.substring(0, i);
                    if (!contacts.containsKey(substring)) {
                        contacts.put(substring, 1);
                    } else {
                        contacts.put(substring, contacts.get(substring) + 1);
                    }
                }
            } else {
                Integer numberOfContactsFound = contacts.get(name);
                if (Objects.isNull(numberOfContactsFound)) {
                    System.out.println("0");
                } else {
                    System.out.println(numberOfContactsFound);
                }
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            System.arraycopy(queriesRowItems, 0, queries[queriesRowItr], 0, 2);
        }

        contacts(null, queries);
//        bufferedWriter.newLine();
//        bufferedWriter.close();
    }
}
