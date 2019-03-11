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
public class MatrixCheckTest {
    /**
     * Test mono().
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenEvenElementsByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true, true, true},
                {false, false, true, true},
                {true, true, false, true},
                {true, false, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenEvenElementsByFalseThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true, true, true},
                {false, true, true, true},
                {true, true, false, true},
                {false, false, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }


}
