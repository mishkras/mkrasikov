package ru.job4j.loop;

/**
 * Calculate.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {

    public int add(int start, int finish) {
        /**
         * int add.
         * @param start - first number.
         * @param finish - final number.
         * @return sum of even numbers from start to finish.
         */
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}