package com.company;

public class AbstractMember implements Member {
    private String name;
    private String surname;

    public AbstractMember(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}
