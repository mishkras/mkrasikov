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
     * Проверяет. что слово начинается с префикса.
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
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}