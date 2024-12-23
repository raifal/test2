package de.rainerfaller;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', birthdate=" + birthdate + "}";
    }
}