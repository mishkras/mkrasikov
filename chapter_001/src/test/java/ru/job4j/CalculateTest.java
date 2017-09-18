package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Mikhail Krasikov (mailto:mishkras@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
	/**
	 * Test echo.
	 */
	@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Mikhail Krasikov";
    String expect = "Echo, echo, echo : Mikhail Krasikov";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
}