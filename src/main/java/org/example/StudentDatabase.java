package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StudentDatabase {
    private List<Student> students;

    public StudentDatabase(List<Student> students) {
        this.students = students;
    }

    public List<Student> findTopStudents(int count) {
        return students.stream()
                .filter(student -> "Информатика".equals(student.specialty))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted(Comparator.comparing(Student::getAverageGrade).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }
}