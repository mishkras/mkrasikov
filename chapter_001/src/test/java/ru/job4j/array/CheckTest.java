package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CheckTest.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class CheckTest {
    /**
     * Test input[] = {true, true, true}.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test input[] = {true, false, true}.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Test input[] = {false, false, false, false}.
     */
    @Test
    public void whenDataMonoByFalseFalseFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test input[] = {false, false, false, false, true}.
     */
    @Test
    public void whenDataNotMonoByFalseFalseFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{false, false, false, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}