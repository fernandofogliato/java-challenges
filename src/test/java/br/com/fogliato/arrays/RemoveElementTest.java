package br.com.fogliato.arrays;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;
import static org.assertj.core.api.Assertions.assertThat;

class RemoveElementTest {

    @Test
    public void case1() {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int k = new RemoveElement().removeElement(nums, val);
        assertThat(k).isEqualTo(2);
        sort(nums, 0, k);
        assertThat(nums).startsWith(2, 2);
    }

    @Test
    public void case2() {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int k = new RemoveElement().removeElement(nums, val);
        assertThat(k).isEqualTo(5);
        sort(nums, 0, k);
        assertThat(nums).startsWith(0, 0, 1, 3, 4);
    }

    @Test
    public void case3() {
        int[] nums = { 2 };
        int val = 3;
        int k = new RemoveElement().removeElement(nums, val);
        assertThat(k).isEqualTo(1);
        sort(nums, 0, k);
        assertThat(nums).startsWith(2);
    }

    @Test
    public void case4() {
        int[] nums = { 1 };
        int val = 1;
        int k = new RemoveElement().removeElement(nums, val);
        assertThat(k).isZero();
        sort(nums, 0, k);
        assertThat(nums).startsWith(1);
    }

    @Test
    public void case5() {
        int[] nums = { 3, 3 };
        int val = 5;
        int k = new RemoveElement().removeElement(nums, val);
        assertThat(k).isEqualTo(2);
        sort(nums, 0, k);
        assertThat(nums).startsWith(3, 3);
    }
}