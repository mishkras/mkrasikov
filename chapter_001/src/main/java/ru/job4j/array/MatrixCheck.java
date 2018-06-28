package ru.job4j.array;

/**
 * MatrixCheck.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Квадратный массив заполнен true или false по диагоналям.
     *
     * @param data матрица.
     * @return таблица умножения.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i == j && data[i][j] == true) {
                    result = true;
                } else if (i == j && data[i][j] == false) {
                    result = true;
                } else if (data[i][data.length - i - 1] == true) {
                    result = true;
                } else if (data[i][data.length - i - 1] == false) {
                    result = true;
                } else {
                    result = false;
                }
            }

        }
        return result;
    }
}