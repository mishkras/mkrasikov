package ru.job4j.array;


/**
 * RotateArray.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class RotateArray {
    /**
     * int[] back.
     *
     * @param array - array of int.
     * @return sort array.
     */
    public int[][] rotate(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = array[j][array.length - i - 1];
            }
        }
        return array;
    }

}
