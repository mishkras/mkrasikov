package ru.job4j.array;

/**
 * SqureTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    /**
     * Test Squre Bound = 3.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * Test Squre Bound = 0.
     */
    @Test
    public void whenBound3Then0() {
        int bound = 0;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{};
        assertThat(rst, is(expect));
    }

    /**
     * Test Squre Bound = 9.
     */
    @Test
    public void whenBound3Then1235456789() {
        int bound = 9;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25, 36, 49, 64, 81};
        assertThat(rst, is(expect));
    }
}