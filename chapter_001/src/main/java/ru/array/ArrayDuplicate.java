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
     * @return array.
     */
    public String[] remove(String[] array) {
        int amountSimilar = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].equals("0")) {
                    continue;
                } else  if (array[i].equals(array[j])) {
                    array[j] = "0";
                    amountSimilar++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("0")) {
                for (int j = array.length - 1; j > i; j--) {
                    if (!array[j].equals("0")) {
                        String glass = array[j];
                        array[j] = array[i];
                        array[i] = glass;
                        break;
                    }
                }
            }
        }

        return Arrays.copyOf(array, array.length - amountSimilar);
    }
}