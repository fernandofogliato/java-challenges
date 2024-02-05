package br.com.fogliato.miscellaneous;

// https://www.algoexpert.io/questions/valid-starting-city
public class ValidStartingCity {

    // O(n) time | O(1) space - where n is the number of cities
    public static int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int totalFuelAvailable = 0;
        int currentCity = 0;
        int startingCity = 0;

        while (startingCity < distances.length) {
            totalFuelAvailable = (totalFuelAvailable + fuel[currentCity] * mpg) - distances[currentCity];
            if (totalFuelAvailable < 0) {
                startingCity++;
                totalFuelAvailable = 0;
                currentCity = startingCity;
                continue;
            }

            currentCity = currentCity+1 > distances.length-1 ? 0 : currentCity+1;
            if (currentCity == startingCity) {
                return startingCity;
            }
        }
        return -1;
    }
}
