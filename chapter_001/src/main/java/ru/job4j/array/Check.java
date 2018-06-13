package ru.job4j.array;

/**
 * Check.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * Заполняет массив квадратом чисел.
     * @param data - массив булевых значеиий..
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}