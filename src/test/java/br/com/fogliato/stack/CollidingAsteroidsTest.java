package br.com.fogliato.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CollidingAsteroidsTest {

    @Test
    public void case1() {
        int[] asteroids = new int[] { 1, 2, 3, -4 };
        assertThat(CollidingAsteroids.collidingAsteroids(asteroids)).containsExactly(-4);
    }

    @Test
    public void case2() {
        int[] asteroids = new int[] { 4, -1, -2, -3 };
        assertThat(CollidingAsteroids.collidingAsteroids(asteroids)).containsExactly(4);
    }
}