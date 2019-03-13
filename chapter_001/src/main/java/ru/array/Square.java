package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    /**
     * Method calculate.
     * Filling the array with squared numbers .
     * @param bound array length.
     * @return filled array.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(i + 1, 2);
        }
        return result;
    }
}