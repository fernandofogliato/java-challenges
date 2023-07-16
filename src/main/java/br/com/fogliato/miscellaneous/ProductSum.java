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
            if (obj instanceof List) {
                sum += productSum((List<Object>) obj, depth + 1);
            } else {
                sum += (int) obj;
            }
        }
        return sum * depth;
    }
}
