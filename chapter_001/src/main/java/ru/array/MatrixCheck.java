package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Method mono.
     * Check diagonals for filling true or false.
     * @param data square matrix.
     * @return boolean result.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length ; i++) {
           if (data[0][0] != data[i][i] || data[0][data.length-1] != data[i][data.length - 1 - i]) {
               result = false;
               break;
           }
        }
        return result;
    }
}