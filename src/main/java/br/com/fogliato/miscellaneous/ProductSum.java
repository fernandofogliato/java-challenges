package br.com.fogliato.miscellaneous;

import java.util.List;

// https://www.algoexpert.io/questions/product-sum
public class ProductSum {

    public static int productSum(List<Object> array) {
        return productSum(array, 1);
    }

    private static int productSum(List<Object> array, int depth)  {
        int sum = 0;
        for (Object obj: array) {
            if (obj instanceof Integer) {
                sum = sum + (int) obj;
            }

            if (obj instanceof List) {
                depth++;
                sum = sum + depth * productSum((List<Object>) obj, depth);
                depth--;
            }
        }
        return sum;
    }
}
