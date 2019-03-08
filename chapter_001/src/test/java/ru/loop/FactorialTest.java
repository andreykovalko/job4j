package ru.loop;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {
    /**
     * Test calc().
     */
    @Test
    public void whenNumberFiveThenFactorialOneHundredAndTwenty() {
        Factorial factor = new Factorial();
        int result = factor.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenNumberZeroThenFactorialOne() {
        Factorial factor = new Factorial();
        int result = factor.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void whenWrongNumberThenMinusOne() {
        Factorial factor = new Factorial();
        int result = factor.calc(-5);
        assertThat(result, is(-1));
    }



}