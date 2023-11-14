package edu.neu.mgen;
// by jiang han

import java.util.ArrayList;
import java.util.List;

public class EngClass {
    private List<Student> students;

    // Constructor
    public EngClass() {
        students = new ArrayList<>();
    }

    // Add a student to the class
    public void addStudent(Student student) {
        students.add(student);
    }

    // Delete a student from the class
    public void deleteStudent(Student student) {
        students.remove(student);
    }

    // Read the list of students
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
