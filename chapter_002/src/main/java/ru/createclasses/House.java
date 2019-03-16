package ru.createclasses;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class House {
    private double length;
    private double width;
    private double numfloor;
    private String address;

    /**
     * Method getLength.
     * Returns a length of the house.
     */
    public double getLength() {
        return this.length;
    }
    /**
     * Method getWidth/
     * Returns a width of the house.
     */
    public double getWidth() {
        return this.width;
    }
    /**
     * Method getNumFloor/
     * Returns the number of floors of the house.
     */
    public double getNumFloor() {
        return this.numfloor;
    }
    /**
     * Method getAddress/
     * Returns the address of the house.
     */
    public String getAddress() {
        return this.address;
    }
    /**
     * Method whoIsControls.
     * Returns the man who controls building the house.
     */
    public String whoIsControls(Engineer engineer) {
        return engineer.getName();
    }
}