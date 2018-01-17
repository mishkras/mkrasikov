package ru.job4j.testtesk;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TestTaskTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class TestTaskTest {
    @Test
    public void whenStringContainsString() {
        TestTask tt = new TestTask();
        String origin = "Привет";
        String sub = "иве";
        boolean exept = true;
        boolean result = tt.contains(origin, sub);
        assertThat(result, is(exept));
    }
}