package ru.array;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {
    /**
     * Method multiple.
     * Get multiplication table.
     * @param size size of matrix.
     * @return matrix with multiplication table.
     */
    public int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return  matrix;
    }
}