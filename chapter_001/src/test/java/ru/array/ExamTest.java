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
public class ExamTest {
    /**
     * Test connectSortedArrays().
     */
    @Test
    public void whenTwoArraysSameThenThirdArray() {
        Exam examine = new Exam();
        int[] arrayfirst = new int[] {1, 2, 3, 4};
        int[] arraysecond = new int[] {1, 2, 3, 4};
        int[] result = examine.connectSortedArrays(arrayfirst, arraysecond);
        int[] expect = new int[] {1, 1, 2, 2, 3, 3, 4, 4};
        assertThat(result, is(expect));
        }

    @Test
    public void whenTwoArraysDifferentThenThirdArray() {
        Exam examine = new Exam();
        int[] arrayfirst = new int[] {1, 2, 3};
        int[] arraysecond = new int[] {4, 5, 6, 8};
        int[] result = examine.connectSortedArrays(arrayfirst, arraysecond);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 8};
        assertThat(result, is(expect));
    }
    }
