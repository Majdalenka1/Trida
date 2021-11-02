package com.company;

public class Student extends AbstractMember {
    private String yearOfBirth;
    private String id;

    public Student(String name, String surname, String yearOfBirth, String id) {
        super(name, surname);
        this.yearOfBirth = yearOfBirth;
        this.id = id;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getId() {
        return id;
    }
}
