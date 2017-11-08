package ru.job4j.max;

/**
 * Max.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max{
    public int max(int first, int second) {
        int maximum = first > second ? first : second;
        return maximum;
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}