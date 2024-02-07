package br.com.fogliato.miscellaneous;

// https://www.algoexpert.io/questions/valid-starting-city
public class ValidStartingCity {

    // O(n) time | O(1) space - where n is the number of cities
    public static int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int milesRemaining = 0;
        int milesRemainingStartingCity = 0;
        int startingCity = 0;

        for (int cityIdx = 1; cityIdx < distances.length; cityIdx++) {
            int distanceFromPreviousCity = distances[cityIdx - 1];
            int fuelFromPreviousCity = fuel[cityIdx-1];
            milesRemaining += fuelFromPreviousCity * mpg - distanceFromPreviousCity;

            if (milesRemaining < milesRemainingStartingCity) {
                milesRemainingStartingCity = milesRemaining;
                startingCity = cityIdx;
            }
        }

        return startingCity;
    }
}
