package br.com.fogliato.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.algoexpert.io/questions/sunset-views
public class SunsetViews {

    // O(n) time | O(n) space - where n is the length of the input array
    public static List<Integer> sunsetViews(int[] buildings, String direction) {
        List<Integer> sunsetViews = new ArrayList<>();

        boolean isEastDirection = "EAST".equals(direction);
        int highest = Integer.MIN_VALUE;
        int idx = isEastDirection ? buildings.length-1 : 0;

        while (idx >= 0 && idx < buildings.length) {
            int height = buildings[idx];
            if (height > highest) {
                if (isEastDirection) {
                    sunsetViews.add(0, idx);
                } else {
                    sunsetViews.add(idx);
                }
                highest = height;
            }

            idx += isEastDirection ? -1 : 1;
        }
        return sunsetViews;
    }
}
