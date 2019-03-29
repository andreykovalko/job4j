package ru.pseudo;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Triangle implements  Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        String line = System.lineSeparator();
        pic.append("+");
        pic.append(line);
        pic.append("++");
        pic.append(line);
        pic.append("+++");
        pic.append(line);
        pic.append("++++");
        return pic.toString();
    }
}	