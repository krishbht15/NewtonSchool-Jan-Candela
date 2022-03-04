package com.company.oops;

public class Student implements Comparable<Student> {

    int rollNumber;
    int marks;

    public Student(int rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}
