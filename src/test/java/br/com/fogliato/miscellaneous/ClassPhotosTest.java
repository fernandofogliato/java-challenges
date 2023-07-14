package br.com.fogliato.miscellaneous;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ClassPhotosTest {

    @Test
    public void case1() {
        List<Integer> redShirtHeights = Lists.list(5, 8, 1, 3, 4);
        List<Integer> blueShirtHeights = Lists.list(6, 9, 2, 4, 5);

        assertThat(new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights)).isTrue();
    }

    @Test
    public void case2() {
        List<Integer> redShirtHeights = Lists.list(3, 5, 6, 8, 2);
        List<Integer> blueShirtHeights = Lists.list(2, 4, 7, 5, 1);

        assertThat(new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights)).isTrue();
    }
}