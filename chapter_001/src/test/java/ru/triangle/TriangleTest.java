package ru.triangle;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    /**
     * Test area().
     */
    @Test
    public void whenSetThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle();
        double resultSquare = triangle.area(0, 0, 0, 2, 2, 0);
        double expected = 2D;
        assertThat(resultSquare, closeTo(expected, 0.1));
    }

    @Test
    public void whenSetWrongThenResultMinusOne() {
        Triangle triangle = new Triangle();
        double resultSquare = triangle.area(1, 1, 2, 2, 3, 3);
        double expected = -1D;
        assertThat(resultSquare, closeTo(expected, 0.1));
    }


}