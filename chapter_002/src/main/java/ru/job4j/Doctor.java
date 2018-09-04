package ru.job4j;

/**
 * Doctor.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Doctor extends Profession {

    public Doctor(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public void threatPatient(Patient patient) {
    }
}