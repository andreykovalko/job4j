package ru.triangle;

import ru.condition.Point;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    /**
     * Method halfPerimeter.
     * Evaluation half of triangle perimeter.
     * @param a distance between points a and b.
     * @param b distance between points b and c.
     * @param c distance between points a and c.
     * @return result half of perimeter.
     */
    public double halfPerimeter(double a, double b, double c) {
        double result = (a + b + c) / 2;
        return result;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Distance between a b.
     * @param b Distance between b c.
     * @param c Distance between a c.
     * @return
     */
    private boolean exist(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a))
           return true;
        else
           return false;
    }

    /**
     * Evaluation square of triangle.
     *
     * sqrt(p *(p - ab) * (p - ac) * (p - bc)).
     *
     * @return Return square  if triangle exists and return -1 if no.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double result = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = halfPerimeter(a, b, c);
        if (this.exist(a, b, c)) {
            double expression = p * (p - a) * (p - b) * (p - c);
            result = Math.sqrt(expression);
            return result;
        }
        return result;
    }
}
