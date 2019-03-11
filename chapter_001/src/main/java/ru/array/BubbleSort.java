package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     * Method sort.
     * Sort ascending.
     * @param array array of integer elements.
     * @return array sorted with bubble method.
     */
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int glass = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = glass;
                }
            }
        }
        return  array;
    }
}