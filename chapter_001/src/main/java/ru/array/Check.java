package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * Method mono.
     * Check array for for filling true or false.
     * @param array array of boolean elements.
     * @return Reversed result true or false.
     */
    public boolean mono(boolean[] array) {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[0] != array[i]) {
                result = false;
            }
        }
        return result;
    }
}