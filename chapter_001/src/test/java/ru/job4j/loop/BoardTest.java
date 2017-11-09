package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * BoardTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    /**
     * Test board 3x3.
     */

    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = "x x" + "\r\n" + " x " + "\r\n" + "x x" + "\r\n";
        assertThat(result, is(expected));
    }
    /**
     * Test board 5x5.
     */
   @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = "x x x" + "\r\n" + " x x " + "\r\n" + "x x x" + "\r\n" + " x x " + "\r\n";
        assertThat(result, is(expected));
//напишите здесь тест, проверяющий формирование доски 5 на 4.
    }
}