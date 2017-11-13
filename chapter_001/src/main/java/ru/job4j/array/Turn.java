package ru.job4j.array;

/**
 * Turn.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     * int[] back.
     *
     * @param array - array of int.
     * @return grafic picture of the board.
     */
    public int[] back(int[] array) {
        for (int j = 0; j < array.length / 2; j++) {
            int tmp = array[array.length - 1 - j];
            array[array.length - 1 - j] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}