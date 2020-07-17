package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Student> setovi = new HashSet<Student>();
        Student s = new Student("Vuk", "Vasic", 1630);
        Student s2 = new Student("Pera", "Vasic", 1630);
        Student s3 = new Student("Peric", "Vasic", 1630);
        setovi.add(s);
        setovi.add(s2);
        setovi.add(s3);
        for (Student st : setovi) {
            System.out.println(st);
    }
}
