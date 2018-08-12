package com.aut.hw3;


import com.aut.hw3.question4.GraduateStudent;
import com.aut.hw3.question4.Student;
import com.aut.hw3.question4.UndergraduateStudent;

public class Main {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {

        // System.out.println((char)27 + "[31mThis text would show up red" + (char)27 + "[0m");

        //runQuestion1();
        //runQuestion2();
        runQuestion4();

    }

    public static void runQuestion1() {

    }


    public static void runQuestion2() {

    }

    public static void runQuestion4() {
        Student student1 = new Student("arya", "12345678");
        Student student2 = new Student("sina", "87654321");
        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent(142);
        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent(142);
        GraduateStudent graduateStudent1 = new GraduateStudent(32, "noorHossaini");
        GraduateStudent graduateStudent2 = new GraduateStudent(32, "poorvatan");
//----------------------------------------------------------------------------------------------------------------------
        System.out.println(ANSI_BLUE);
        student1.displayInfo();
        System.out.println(ANSI_RED);
        student1.setName("soroush");
        student1.setStudentID("9533080");
        student1.setEnteringYear(1395);
        student1.displayInfo();
        System.out.println(ANSI_BLACK);
        student2.displayInfo();
        System.out.println(ANSI_GREEN);
        student2.setName("hasan");
        student2.setStudentID("9459");
        student2.setEnteringYear(1393);
        student2.displayInfo();
        System.out.println(ANSI_PURPLE);
        //--------------------------------------------------------------------------------------------------------------
        undergraduateStudent1.displayStudentInformation();
        System.out.println(ANSI_CYAN);
        undergraduateStudent1.setName("saman");
        undergraduateStudent1.setStudentID("2689");
        undergraduateStudent1.setEnteringYear(1394);
        undergraduateStudent1.displayStudentInformation();
        System.out.println(ANSI_YELLOW);
        undergraduateStudent2.displayStudentInformation();
        System.out.println(ANSI_BLUE);
        undergraduateStudent2.setName("setare");
        undergraduateStudent2.setStudentID("3489");
        undergraduateStudent2.setEnteringYear(1392);
        undergraduateStudent2.displayStudentInformation();
        System.out.println(ANSI_RED);
        //--------------------------------------------------------------------------------------------------------------
        graduateStudent1.displayStudentInformation();
        System.out.println(ANSI_WHITE);
        graduateStudent1.setName("mina");
        graduateStudent1.setStudentID("3489");
        graduateStudent1.setEnteringYear(1388);
        graduateStudent1.setSupervisorName("nazerfard");
        graduateStudent1.displayStudentInformation();
        System.out.println(ANSI_BLACK);
        graduateStudent2.displayStudentInformation();
        System.out.println(ANSI_CYAN);
        graduateStudent2.setName("ali");
        graduateStudent2.setStudentID("3229");
        graduateStudent2.setEnteringYear(1389);
        graduateStudent1.setSupervisorName("falah");
        graduateStudent2.displayStudentInformation();
    }
}
