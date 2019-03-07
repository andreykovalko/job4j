package ru.condition;

/**
 * Evaluation of distance between two points.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * Method distance
     * A distance between two points.
     * @param x1,y1,x2,y2 coordinates.
     * @return distance.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double x2MinusX1InPow2 = Math.pow((x2 - x1), 2);
        double y2MinusY1InPow2 = Math.pow((y2 - y1), 2);
        double result = Math.sqrt(x2MinusX1InPow2 + y2MinusY1InPow2);
        return result;
    }

}