package br.com.fogliato.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/
public class RomanNumberToInteger {

    public static void main(String[] args) {
//        String s = "DCXXI";
        Map<String, Integer> table = new HashMap<>();
        table.put("I", 1);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
        table.put("D", 500);
        table.put("M", 1000);

        String s = "MCMXCIV";
        int result = 0;
        String nextValue = "";
        for (int i = 0; i < s.length(); i++) {
            String curr = s.charAt(i) + "";
            nextValue = i+1 < s.length() ? s.charAt(i+1) + "" : "";

            if (!nextValue.equals("") && (table.get(curr) < table.get(nextValue))) {
                result -= table.get(curr);
            } else {
                result += table.get(curr);
            }
        }
        System.out.println(result);
    }
}
