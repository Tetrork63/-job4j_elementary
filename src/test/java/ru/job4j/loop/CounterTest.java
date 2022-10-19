package ru.job4j.loop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTenToHundredThen2530() {
        int start = 10;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2530;
        assertThat(result).isEqualTo(expected);
    }
}