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
        int counterTrue = 0, counterFalse = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                counterTrue++;
            } else {
                counterFalse++;
            }
        }
        if (counterTrue == array.length || counterFalse == array.length) {
            return true;
        } else {
            return  false;
        }
    }
}