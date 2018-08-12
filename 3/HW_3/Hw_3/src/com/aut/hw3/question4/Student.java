package com.aut.hw3.question4;

import java.lang.*;

public class Student {

    protected String name;
    protected String studentID;
    protected double enteringYear;

    Student(String name, String studentID, Double enteringYear) {

        this.name = name;
        this.studentID = studentID;
        this.enteringYear = enteringYear;

    }

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;

    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getEnteringYear(String s) {
        return enteringYear;
    }

    public double getEnteringYear() {
        return enteringYear;
    }

    public void setEnteringYear(double enteringYear) {
        this.enteringYear = enteringYear;
    }

    public void displayInfo() {
        System.out.println("name :" + name);
        System.out.println("studentID :" + studentID);
        System.out.println("enteringYear :" + enteringYear);
       // return String.valueOf(Double.parseDouble(name));
      //  return "studentID";
     //   return String.valueOf(enteringYear);

    }


}