package br.com.fogliato.miscellaneous;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        var richest = 0;
        for (int i = 0; i < accounts.length; i++) {
            var accountBalance = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                accountBalance += accounts[i][j];
            }
            if (accountBalance > richest) {
                richest = accountBalance;
            }
        }
        return richest;
    }
}
