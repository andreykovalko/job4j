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
public class TurnTest {
    /**
     * Test square().
     */
    @Test
    public void whenArrayWithEvenAmountOfElementsThenReversedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.reverse(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayWithOddAmountOfElementsThenReversedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 3, 5, 7, 9};
        int[] result = turner.reverse(input);
        int[] expect = new int[] {9, 7, 5, 3, 1};
        assertThat(result, is(expect));
    }
}