package ru.job4j.array;

/**
 * Matrix.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {
    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param size размер таблицы.
     * @return таблица умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
