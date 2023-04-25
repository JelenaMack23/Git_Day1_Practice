package day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;
    private String studentId;

    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGarde(grade);
        setStudentId(studentId);
    }

    public char getGarde() {
        return grade;
    }

    public void setGarde(char garde) {
        this.grade = garde;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study(){

    }
}
