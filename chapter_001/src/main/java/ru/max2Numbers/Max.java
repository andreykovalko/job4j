package ru.max2numbers;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Method max
     * Evaluation maximum two numbers.
     * @param firstNumber, secondNumber.
     * @return maximum.
     */
    public int max(int firstNumber, int secondNumber) {
        int maximum = firstNumber > secondNumber ? firstNumber : secondNumber;
        return maximum;
    }
}
