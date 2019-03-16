package ru.createclasses;

/**
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {
    /**
     * Method cure.
     * Doctor cure patient.
     * @param patient doctor's patient.
     */
    public void cure(Patient patient) {

    }
    /**
     * Method heal.
     * Get patient diagnose.
     * @param patient doctor's patient.
     */
    public Diagnose heal(Patient patient) {
       return patient.getDiagnose();
    }

}