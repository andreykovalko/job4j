package ru.loop;

import java.util.function.BiPredicate;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Method rightTrl.
     * Painting right side of pyramid.
     * @param height height of pyramid.
     * @return screen.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Method leftTrl.
     * Painting left side of pyramid.
     * @param height height of pyramid.
     * @return screen.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Method pyramid.
     * Painting pyramid.
     * @param height height of pyramid.
     * @return screen.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Method loopBy.
     * Checking terms when we should fill '^'.
     * @param height height of pyramid.
     * @param width width of pyramid.
     * @param predict term of filling '^'.
     * @return screen.
     */
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        if (height > 1) {
            StringBuilder screen = new StringBuilder();
            for (int row = 0; row != height; row++) {
                for (int column = 0; column != width; column++) {
                    if (predict.test(row, column)) {
                        screen.append("^");
                    } else {
                        screen.append(" ");
                    }
                }
                screen.append(System.lineSeparator());
            }
            return screen.toString();
        } else {
            return "Incorrect height of pyramid";
        }
    }
}