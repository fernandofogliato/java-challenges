package br.com.fogliato.arrays;

// https://www.algoexpert.io/questions/array-of-products
public class ArrayOfProducts {

    // Time O(n)
    // Space O(n)
    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];
        int product = 1;

        // Sum the products for the left elements
        for (int i = 0; i < array.length; i++) {
            products[i] = product;
            product *= array[i];
        }

        // Sum the products for the right and replace by the sum of all elements
        product = 1;
        for (int i = array.length-1; i >= 0; i--) {
            products[i] *= product;
            product *= array[i];
        }
        return products;
    }
}
