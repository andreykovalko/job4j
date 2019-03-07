package ru.max3numbers;

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
public class Max3NumbersTest {
    /**
     * Test max().
     */
    @Test
    public void whenThirdMax() {
        Max3Numbers maxNumber = new Max3Numbers();
        int result = maxNumber.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenFirstMax() {
        Max3Numbers maxNumber = new Max3Numbers();
        int result = maxNumber.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondMax() {
        Max3Numbers maxNumber = new Max3Numbers();
        int result = maxNumber.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenAllSame() {
        Max3Numbers maxNumber = new Max3Numbers();
        int result = maxNumber.max(1, 1, 1);
        assertThat(result, is(1));
    }

}