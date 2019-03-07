package ru.max3Numbers;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max3Numbers {
    /**
     * Method max
     * Evaluation maximum three numbers.
     * @param firstNumber
     * @param secondNumber
     * @param thirdNumber
     * @return maximum.
     */
    public int max (int firstNumber, int secondNumber, int thirdNumber) {
        int maximumFirstSecond = firstNumber > secondNumber ? firstNumber : secondNumber;
        int maximum = maximumFirstSecond > thirdNumber ? maximumFirstSecond : thirdNumber;
        return maximum;
    }
}
