package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Teacher teacher = new Teacher("Pink", "Horse");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Uplne", "Ruzovouckaty", "1111", "007"));
        students.add(new Student("Malicko", "Hloupouckaty", "2222", "001"));
        students.add(new Student("Uplne", "Blbej", "3333", "003"));

        SchoolClass sc = new SchoolClass("1.A.", "2021", students, teacher);
        sc.printClassInfo();
        System.out.println();
        sc.printClassInfo(true);
        sc.printClassInfo(new File("./klass.txt"));
    }
}
