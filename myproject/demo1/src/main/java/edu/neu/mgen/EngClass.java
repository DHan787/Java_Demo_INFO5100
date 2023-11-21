/*
 * @Author: Jinag Han
 * @Date: 2023-11-14 12:06:52
 * @LastEditTime: 2023-11-20 21:31:44
 * @Description: 
 * 
 */
package edu.neu.mgen;

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
