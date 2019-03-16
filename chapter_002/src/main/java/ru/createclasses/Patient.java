package ru.createclasses;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Patient {
    private String name;
    private Diagnose diagnose;

    /**
     * Method getName.
     * Returns name of patient.
     */
    public String getName() {
        return name;
    }
    /**
     * Method getDiagnose.
     * Get patient diagnose.
     */
    public Diagnose getDiagnose() {
        return this.diagnose;
    }
}