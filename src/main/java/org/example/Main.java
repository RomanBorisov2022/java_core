package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Student1", Arrays.asList(4.0, 4.5, 5.0), "Информатика"),
                new Student("Student2", Arrays.asList(4.7, 4.8, 4.9), "Информатика"),
                new Student("Student3", Arrays.asList(4.8, 4.9, 5.0), "Биология"),
                new Student("Student4", Arrays.asList(5.0, 5.0, 5.0), "Информатика"),
                new Student("Student5", Arrays.asList(4.5, 4.6, 4.7), "Информатика")
        );

        StudentDatabase studentDatabase = new StudentDatabase(students);

        List<Student> topStudents = studentDatabase.findTopStudents(5);

        topStudents.forEach(student -> System.out.println(student.getName() + ": " + student.getAverageGrade()));
    }
}