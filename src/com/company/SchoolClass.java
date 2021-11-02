package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class SchoolClass {
    private String name;
    private String year;
    private List<Student> students;
    private Teacher teacher;

    public SchoolClass(String name, String year, List<Student> students, Teacher teacher) {
        this.name = name;
        this.year = year;
        this.students = students;
        this.teacher = teacher;
    }

    public void printClassInfo() {
        System.out.printf("%s, %s, %s\n", name, teacher.getName(), teacher.getSurname());
        for (Student s: students) {
            System.out.printf("%s, %s %s\n", s.getId(), s.getName(), s.getSurname());
        }
    }

    public void printClassInfo(boolean extended) {
        System.out.println("####################################");
        System.out.printf("Třída: %s (ročník: %s)\n", name, year);
        System.out.printf("Třídní učitel: %s, %s\n", teacher.getName(), teacher.getSurname());
        System.out.printf("Počet studentů: %d\n", students.size());
        System.out.println();
        System.out.println("####################################");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("# %d # %s - %s %s (%s)\n", i, s.getId(), s.getName(), s.getSurname(), s.getYearOfBirth());
        }
    }

    public void printClassInfo(File f) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(f);
        pw.printf("%s, %s, %s\n", name, teacher.getName(), teacher.getSurname());
        for (Student s: students) {
            pw.printf("%s, %s %s\n", s.getId(), s.getName(), s.getSurname());
        }
        pw.close();
    }
}
