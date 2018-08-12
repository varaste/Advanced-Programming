package com.aut.hw3.question4;


import com.aut.hw3.question3.C;

public class UndergraduateStudent extends Student {


    public final int CoursesUndergraduateStudent = 142;


    public UndergraduateStudent(int coursesUndergraduateStudent) {

    }

    public int getCoursesUndergraduateStudent() {
        return CoursesUndergraduateStudent;
    }


    public void displayStudentInformation() {

        super.displayInfo();
        System.out.println("CoursesUndergraduateStudent :" + CoursesUndergraduateStudent);
        // System.out.println("TypeOfEntry :"+TypeOfEntry);

    }


}
