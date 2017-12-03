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
        int[][] matrix = new int[array.length][array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                matrix[i][j] = array[j][array.length - i - 1];
            }
        }
        return array;
    }
}