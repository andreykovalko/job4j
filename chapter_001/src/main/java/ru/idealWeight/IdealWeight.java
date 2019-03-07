package ru.idealweight;

/**
 * Evaluation the best body mass index.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class IdealWeight {
    /**
     * Method manWeight
     * The best man's weight
     * @param height height.
     * @return weight.
     */
    public double manWeight(double height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    /**
     * Method womanWeight
     * The best woman's weight
     * @param height height.
     * @return weight.
     */
    public double womanWeight(double height) {
        double result = (height - 110) * 1.15;
        return result;
    }

}