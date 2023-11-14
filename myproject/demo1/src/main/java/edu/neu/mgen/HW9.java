package edu.neu.mgen;
//  by jiang han

public class HW9 {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1001, "Jiang", "Han");
        Student student2 = new Student(1002, "Henri", "Li");
        // Default
        Student student3 = new Student();

        // Create an engineering class
        EngClass engClass = new EngClass();

        // Add students
        engClass.addStudent(student1);
        engClass.addStudent(student2);
        engClass.addStudent(student3);

        // Display students
        engClass.displayStudents();

        // Remove a student
        engClass.deleteStudent(student1);

        System.out.println("After delete student1");
        // Display students again
        engClass.displayStudents();
    }
}
