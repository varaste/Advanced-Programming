package com.aut.hw3.question4;


public class GraduateStudent extends Student {

    protected final int CoursesGraduateStudent = 32;
    protected String SupervisorName;

    public GraduateStudent(int coursesGraduateStudent, String supervisorName) {

        super();
        this.SupervisorName = supervisorName;

    }

    public int getCoursesGraduateStudent() {
        return CoursesGraduateStudent;
    }

    public String getSupervisorName() {
        return SupervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        SupervisorName = supervisorName;
    }

    public void displayStudentInformation() {

        super.displayInfo();
        System.out.println("CoursesGraduateStudent is :" + CoursesGraduateStudent);
        System.out.println("SupervisorName is :" + SupervisorName);

    }

}
