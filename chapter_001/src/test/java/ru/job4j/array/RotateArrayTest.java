package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * RotateArrayTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class RotateArrayTest {
    /**
     * Test RotateArray {{1, 2}, {3, 4}}.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray ra = new RotateArray();
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] result = {{1, 2}, {3, 4}};
        assertThat(ra.rotate(matrix), is(result));
        //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
    }

    /**
     * Test RotateArray {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray ra = new RotateArray();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertThat(ra.rotate(matrix), is(result));
        //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
    }
}