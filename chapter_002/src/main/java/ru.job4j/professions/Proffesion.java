package ru.job4j.proffesions;

/**
 * Proffesion.
 *
 * @author Mikhail Krasikov (mailto:mishrkas@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Proffesion {
	public String name;
	public int age;
	public String proffesionalSpecialization;
	public int workExperience;

	public Proffesion() {
	}

	public Proffesion(String name, int age, String proffesionalSpecialization, int workExperience) {
		this.name = name;
		this.age = age;
		this.proffesionalSpecialization = proffesionalSpecialization;
		this.workExperience = workExperience;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getProffesionalSpecialization() {
		return this.proffesionalSpecialization;
	}
	
	public int getWorkExperience() {
		return this.workExperience;
	}
}