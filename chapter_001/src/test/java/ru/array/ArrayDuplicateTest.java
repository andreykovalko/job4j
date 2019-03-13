package ru.array;

        import org.junit.Test;

        import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    /**
     * Test remove().
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] input = {"Andrew", "Andrew", "Andrew", "Vasiliy", "Olga", "Nadezda", "Victor", "Olga", "Andrew"};
        String[] result = ad.remove(input);
        String[] expect = {"Andrew", "Victor", "Nadezda", "Vasiliy", "Olga"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenAllDuplicatesThenOneWord() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] input = {"Andrew", "Andrew", "Andrew", "Andrew"};
        String[] result = ad.remove(input);
        String[] expect = {"Andrew"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenOneWordThenOneWord() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] input = {"Andrew"};
        String[] result = ad.remove(input);
        String[] expect = {"Andrew"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }







}
