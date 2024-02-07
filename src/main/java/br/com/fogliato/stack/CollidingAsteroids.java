package br.com.fogliato.stack;

import java.util.Stack;

// https://www.algoexpert.io/questions/colliding-asteroids
public class CollidingAsteroids {

    // O(n) time | O(n) space - where n is the number asteroids
    public static Integer[] collidingAsteroids(int[] asteroids) {
        Stack<Integer> asteroidsAvailable = new Stack<>();
        asteroidsAvailable.add(asteroids[0]);

        for (int asteroidIdx = 1; asteroidIdx < asteroids.length; asteroidIdx++) {
            int currDirection = asteroids[asteroidIdx];

            boolean hasBeenDestroyed = false;
            while (!asteroidsAvailable.isEmpty() && asteroidsAvailable.peek() >= 0) {
                int previousDirection = asteroidsAvailable.peek();
                int sizeCurrAsteroid = Math.abs(currDirection);
                int sizePreviousAsteroid = Math.abs(previousDirection);

                // Both get destroyed
                if (sizeCurrAsteroid == sizePreviousAsteroid) {
                    asteroidsAvailable.pop();
                    hasBeenDestroyed = true;
                    break;
                }

                if (sizeCurrAsteroid >= sizePreviousAsteroid) {
                    asteroidsAvailable.pop(); // Destroy previous
                } else {
                    // Destroy current
                    hasBeenDestroyed = true;
                    break;
                }
            }

            if (!hasBeenDestroyed) {
                asteroidsAvailable.add(currDirection);
            }
        }
        return asteroidsAvailable.toArray(new Integer[0]);
    }
}
