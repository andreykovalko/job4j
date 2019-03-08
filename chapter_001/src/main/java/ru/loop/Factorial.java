package ru.loop;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Method calc
     * Evaluation factorial.
     * @param number number for factorial evaluation
     * @return factorial.
     */
    public int calc(int number) {
        if (number > 0) {
            int factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial = factorial * i;
            }
            return factorial;
        } else if (number == 0) {
                 return 1;
        } else {
                 return -1;
          }
    }
}