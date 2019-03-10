package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * Method indexOf.
     * Searching element.
     * @param array array of elements.
     * @param el element which we should find.
     * @return the first index of similar element.
     */
    public int indexOf(int[] array, int el) {
        int result = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }
}