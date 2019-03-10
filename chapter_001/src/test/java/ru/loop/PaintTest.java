package ru.loop;

        import org.junit.Test;
        import java.util.StringJoiner;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    /**
     * Test paint().
     */
    @Test
    public void whenHeightOfPyramid4() {
        Paint paint = new Paint();
        String result = paint.pyramid(4);
        System.out.println(result);
        assertThat(result,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenHeightOfPyramid2() {
        Paint paint = new Paint();
        String result = paint.pyramid(2);
        System.out.println(result);
        assertThat(result,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add(" ^ ")
                                .add("^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenHeightOfPyramidWrong() {
        Paint paint = new Paint();
        String result = paint.pyramid(1);
        assertThat(result, is("Incorrect height of pyramid"));
    }
}





