package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MatrixCheckTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheckTest {
    /**
     * Test matrix = {true, true, true},
     * {false, true, true},
     * {true, false, true}.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test matrix = {true, true, false},
     * {false, false, true},
     * {true, false, true}.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Test matrix = {false, true, false},
     * {true, false, true},
     * {false, true, false}.
     */
    @Test
    public void whenDataMonoByFalseThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {false, true, false},
                {true, false, true},
                {false, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test matrix = {false, true, true},
     * {true, false, true},
     * {false, true, false}.
     */
    @Test
    public void whenDataNotMonoByFalseThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][]{
                {false, true, true},
                {true, false, true},
                {false, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}