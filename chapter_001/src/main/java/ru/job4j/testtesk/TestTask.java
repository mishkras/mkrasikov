package ru.job4j.testtesk;

import java.util.Arrays;

/**
 * TestTask.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class TestTask {
    public boolean contains(String origin, String sub) {
        boolean res = true;
        char[] massifOrigin = origin.toCharArray();
        char[] massifSub = sub.toCharArray();
        for (int i = 0; i < massifOrigin.length; i++) {
            for (int j = 0; j <= massifSub.length; j++) {
                if (massifOrigin.equals(massifSub)) {
                    res = true;
                }
            }
        }
        return res;
    }
}