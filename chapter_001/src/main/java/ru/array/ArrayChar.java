package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Method startWith.
     * Check beginning of word.
     * @param prefix compared prefix.
     * @return If prefix is begin of word.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        if (value.length > this.data.length || value.length <= 0) {
            result = false;
        } else {
            for (int i = 0; i < value.length; i++) {
                if (value[i] != this.data[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}