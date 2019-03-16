package ru.createclasses;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */


public class Diagnose {
    private String record;

    /**
     * Method getRecord.
     * Returns record from patient card.
     */
    public String getRecord() {
        return this.record;
    }

    /**
     * Method addRecord.
     * Records note to patient card.
     */
    public void addRecord(String record) {
        this.record = record;
    }
}
