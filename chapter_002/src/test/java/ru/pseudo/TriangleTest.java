package ru.pseudo;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        String line = System.lineSeparator();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("+")
                                .append(line)
                                .append("++")
                                .append(line)
                                .append("+++")
                                .append(line)
                                .append("++++")
                                .toString()
                )
        );
    }
}	