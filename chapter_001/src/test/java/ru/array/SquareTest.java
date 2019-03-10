package ru.array;

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
public class SquareTest {
    /**
     * Test square().
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] res = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(res, is(expect));
    }

    @Test
    public void whenBound6Then149162536() {
        int bound = 6;
        Square square = new Square();
        int[] res = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36};
        assertThat(res, is(expect));
    }

    @Test
    public void whenBound1Then1() {
        int bound = 1;
        Square square = new Square();
        int[] res = square.calculate(bound);
        int[] expect = new int[] {1};
        assertThat(res, is(expect));
    }

}





