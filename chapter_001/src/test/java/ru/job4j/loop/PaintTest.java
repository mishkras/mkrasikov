package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PaintTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    /**
     * Test piramid h = 2.
     */

    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = " ^ " + "\n" + "^^^" + "\n";
        assertThat(result, is(expected));
    }

    /**
     * Test piramid h = 3.
     */
    //" ^ " + "\n" + "^^^" + "\n" + "^^^^^" + "\n"
   /* @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = " ^ " + "\n" + "^^^" + "\n" + "^^^^^" + "\n";
        assertThat(result, is(expected));//напишите здесь тест, проверяющий формирование пирамиды для высоты 3.
    }*/
}