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
public class CounterTest {
    /**
     * Test add().
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1,10);
        assertThat(result, is(30));
    }
    
    @Test
    public void whenSumEvenNumbersFromZeroToZeroThenZero() {
        Counter counter = new Counter();
        int result = counter.add(0,0);
        assertThat(result, is(0));
    }



}