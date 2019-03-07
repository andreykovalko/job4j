package ru.loop;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Method add
     * Sum even numbers.
     * @param beginning
     * @param end
     * @return sum.
     */
    public int add (int beginning, int end) {
        int sum = 0;
        for (int i = beginning; i <=end ; i++) {
          if (i%2==0)
              sum = sum + i;
        }
        return sum;
    }
}
