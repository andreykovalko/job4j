package ru.converter;

/**
 * Cyrrency converter.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Converter {
    /**
     * Method rubleToEuro
     * Convert roubles to euro.
     * @param value rubles.
     * @return Euro.
     */
    public int rubleToEuro(int value) {
        int result = value / 70;
        return result;
    }

    /**
     * Method euroToRuble
     * Convert euro to rubles.
     * @param value euro.
     * @return rubles.
     */
    public int euroToRuble(int value) {
        int result = value * 70;
        return result;
    }

    /**
     * Method rubleToDollar
     * Convert rubles to dollars.
     * @param value rubles.
     * @return Dollars
     */
    public int rubleToDollar(int value) {
        int result = value / 60;
        return result;
    }

    /**
     * Method dollarToRuble
     * Convert dollars to rubles.
     * @param value dollars.
     * @return rubles.
     */
    public int dollarToRuble(int value) {
        int result = value * 60;
        return result;
    }






}