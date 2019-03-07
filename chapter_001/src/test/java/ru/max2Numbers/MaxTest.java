package ru.max2numbers;

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
public class MaxTest {
    /**
     * Test max().
     */
    @Test
    public void whenMax1To2Then2() {
        Max maxNumber = new Max();
        int result = maxNumber.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        Max maxNumber = new Max();
        int result = maxNumber.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        Max maxNumber = new Max();
        int result = maxNumber.max(1, 1);
        assertThat(result, is(1));
    }

}