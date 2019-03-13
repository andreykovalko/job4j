package ru.array;

import java.util.Arrays;
/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * Method remove.
     * Remove duplicate words.
     * @param array array of string.
     * @return array without duplicates.
     */
    public String[] remove(String[] array) {
        int beginDuplicatePartOfArray = array.length;
        for (int out = 0; out < beginDuplicatePartOfArray; out++) {
            for (int in = out + 1; in < beginDuplicatePartOfArray; in++) {
               if (array[out].equals(array[in])) {
                  array[in] = array[beginDuplicatePartOfArray - 1];
                  beginDuplicatePartOfArray--;
                  in--;
               }
            }
        }
        return Arrays.copyOf(array, beginDuplicatePartOfArray);
    }
}