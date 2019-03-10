package ru.loop;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Method pyramid.
     * Painting pyramid.
     * @param height height of pyramid.
     * @return screen.
     */
    public String pyramid(int height) {
        if (height > 1) {
            StringBuilder screen = new StringBuilder();
            int width = 2 * height - 1;
            for (int row = 0; row != height; row++) {
                for (int column = 0; column != width; column++) {
                    if (row >= height - column - 1 && row + height - 1 >= column) {
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