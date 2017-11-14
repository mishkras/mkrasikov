package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * TurnTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arr = {2, 6, 1, 4};
        int[] expect = {4, 1, 6, 2};
        assertThat(turn.back(arr), is(expect));//напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
    }
    /**
     * Test Turn {1, 2, 3, 4, 5}.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expect = {5, 4, 3, 2, 1};
        assertThat(turn.back(arr), is(expect));//напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
    }
}
