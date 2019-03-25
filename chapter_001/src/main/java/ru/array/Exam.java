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
     * @param arfirst sorted array of integer  elements.
     * @param arsecond sorted array of integer  elements.
     * @return sorted array consist of arfirst and arsecond.
     */
    public int[] connectSortedArrays(int[] arfirst, int[] arsecond) {
        int[] arcommon = new int[arfirst.length + arsecond.length];
        int i = 0, j = 0, count = 0;
        while (count < arcommon.length) {
            if (i < arfirst.length && j < arsecond.length) {
                if (arfirst[i] < arsecond[j]) {
                    arcommon[count++] = arfirst[i];
                    i++;
                } else {
                    arcommon[count++] = arsecond[j];
                    j++;
                }
            }
           if (i == arfirst.length) {
               arcommon[count++] = arsecond[j];
               j++;
           } else if (j == arsecond.length) {
                arcommon[count++] = arsecond[i];
                i++;
            }
        }
        return arcommon;
    }
}