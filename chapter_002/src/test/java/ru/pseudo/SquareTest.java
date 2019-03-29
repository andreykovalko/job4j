package ru.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        String line = System.lineSeparator();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("+ + + +")
                                .append(line)
                                .append("+     +")
                                .append(line)
                                .append("+     +")
                                .append(line)
                                .append("+ + + +")
                                .toString()
                )
        );
    }
}	