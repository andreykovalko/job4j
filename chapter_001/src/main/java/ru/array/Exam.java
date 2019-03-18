package ru.array;

/*
Term for the exam task.
It exists two sorted arrays, we should connect this arrays into third in the same order.
 */

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Exam {
    /**
     * Method connectSortedArrays.
     * Connect two sorted arrays.
     * @param arrayFirst sorted array of integer  elements.
     * @param arraySecond sorted array of integer  elements.
     * @return array sorted with bubble method.
     */
    public int[] connectSortedArrays(int[] arrayFirst, int[] arraySecond) {
        int[] arrayCommon = new int[arrayFirst.length + arraySecond.length];
        int i = 0, j = 0, countcommon = 0;
        while (i < arrayFirst.length && j < arraySecond.length) {
            if (arrayFirst[i] < arraySecond[j]) {
                arrayCommon[countcommon++] = arrayFirst[i];
                i++;
            } else {
                arrayCommon[countcommon++] = arraySecond[j];
                j++;
            }
        }
        System.arraycopy(arrayFirst, i, arrayCommon, countcommon, (arrayFirst.length - i));
        System.arraycopy(arraySecond, j, arrayCommon, countcommon, (arraySecond.length - j));
        return arrayCommon;
    }
}