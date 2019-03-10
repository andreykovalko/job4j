package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     * Method reverse.
     * Reverse elements in array.
     * @param array array of elements.
     * @return Reversed array.
     */
    public int[] reverse(int[] array) {
        int k = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int glass = array[i];
            array[i] = array[k];
            array[k] = glass;
            k--;
        }
        return array;
    }
}