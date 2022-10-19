package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {33, 44, 11, 22, 55};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 22, 33, 44, 55};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {31, 41, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 31, 41};
        assertThat(result).containsExactly(expected);
    }
}