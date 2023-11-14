package edu.neu.mgen;

// by han jiang
public class Student {
    // Id of the student, default 0000
    private int studentID;
    // Firstname of the student, default Notgiven
    private String firstName;
    // Lastname of the student, default Notgiven
    private String lastName;

    // Default constructor
    public Student() {
        this.studentID = 1000;
        this.firstName = "Notgiven";
        this.lastName = "Notgiven";
    }

    // Constructor
    public Student(int studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + studentID +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                '}';
    }
}
