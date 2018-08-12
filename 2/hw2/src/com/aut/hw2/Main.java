package com.aut.hw2;

import com.aut.hw2.question1.Compelex;
import com.aut.hw2.question2.Rectangle;
import com.aut.hw2.question2.Square;
import com.aut.hw2.question2.Triangle;
import com.aut.hw2.question3.Adress;
import com.aut.hw2.question4.Contact;
import com.aut.hw2.question5.Machine;
import javafx.scene.shape.Circle;

public class Main {


    public static void main(String[] args) {
        runQuestion1();
        runQuestion2();
        runQuestion3();
        runQuestion4();
        runQuestion5();

    }

    private static void runQuestion1() {

        Compelex comp1 = new Compelex();
        Compelex comp2 = new Compelex();
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp1.getImg1());
        System.out.println(comp1.getReal1());
        System.out.println(comp2.getImg1());
        System.out.println(comp2.getReal1());
        comp1.setImg1(7);
        comp1.setReal1(8);
        comp2.setImg1(4);
        comp2.setReal1(6);
        comp1.isEual(comp2);
        comp2.isEual(comp1);
        comp1.add(comp2);
        comp1.subtraction(comp2);
        comp1.multiply(comp2);
        comp1.division(comp2);
        System.out.println(comp1.add(comp2));
        System.out.println(comp1.subtraction(comp2));
        System.out.println(comp1.multiply(comp2));
        System.out.println(comp1.division(comp2));
        System.out.println(comp1.isEual(comp2));
        System.out.println(comp2.isEual(comp1));

    }

    private static void runQuestion2() {

        Triangle tri1 = new Triangle(2, 3, 4); // inputs are sides
        Triangle tri2 = new Triangle(3, 3, 3);
        System.out.println(tri1);
        System.out.println(tri2);
        System.out.println(tri1.getLength3());
        System.out.println(tri1.getLength2());
        System.out.println(tri1.getLength1());
        System.out.println(tri2.getLength3());
        System.out.println(tri2.getLength2());
        System.out.println(tri2.getLength1());
        tri1.setLength3(8);
        tri1.setLength2(5);
        tri1.setLength1(4);
        tri2.setLength3(6);
        tri2.setLength2(8);
        tri2.setLength1(2);
        System.out.println(tri1.getLength3());
        System.out.println(tri1.getLength2());
        System.out.println(tri1.getLength1());
        System.out.println(tri2.getLength3());
        System.out.println(tri2.getLength2());
        System.out.println(tri2.getLength1());
        System.out.println(tri1.calculateArea());
        System.out.println(tri2.calculateArea());
        System.out.println(tri1.calculatePerimeter());
        System.out.println(tri2.calculatePerimeter());
        tri1.equilateralTriangle();
        tri1.isoscelesTriangle();
        tri2.equilateralTriangle();
        tri2.isoscelesTriangle();
        tri1.isEqual(tri2);
        tri2.isEqual(tri1);


        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle rect2 = new Rectangle(7, 6);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());
        System.out.println(rect2.getLength());
        System.out.println(rect2.getWidth());
        rect1.setLength(5);
        rect1.setWidth(4);
        rect2.setLength(1);
        rect2.setWidth(6);
        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());
        System.out.println(rect2.getLength());
        System.out.println(rect2.getWidth());
        rect1.calculateArea();
        rect2.calculateArea();
        rect1.calculatePerimeter();
        rect2.calculatePerimeter();
        rect1.isEqual(rect2);
        rect2.isEqual(rect1);
        rect1.isSquare();
        rect2.isSquare();


        Square squ1 = new Square(4);
        Square squ2 = new Square(8);
        System.out.println(squ1);
        System.out.println(squ2);
        System.out.println(squ1.getLength());
        System.out.println(squ2.getLength());
        squ1.setLength(6);
        squ1.setLength(7);
        System.out.println(squ1.getLength());
        System.out.println(squ2.getLength());
        System.out.println(squ1.calculatePerimeter());
        System.out.println(squ2.calculatePerimeter());
        System.out.println(squ1.calculateArea());
        System.out.println(squ2.calculateArea());
        squ1.isEqual(squ2);
        squ2.isEqual(squ1);

        Circle cir1 = new Circle(5);
        Circle cir2 = new Circle(8);
        System.out.println(cir1);
        System.out.println(cir2);
        System.out.println(cir1.getRadius());
        System.out.println(cir2.getRadius());
        cir1.setRadius(7);
        cir2.setRadius(4);
        System.out.println(cir1.getRadius());
        System.out.println(cir2.getRadius());


    }

    private static void runQuestion3() {

        Adress adress = new Adress("tehran", "velenjak", "22", "4", "14527815566");
        Adress adress1 = new Adress("tehran", "darakeh", "82", "5");
        System.out.println(adress);
        System.out.println(adress1);
        System.out.println(adress.getNumber());
        System.out.println(adress.getApartment());
        System.out.println(adress.getAvenue());
        System.out.println(adress.getCity());
        System.out.println(adress.getPlaque());
        System.out.println(adress1.getApartment());
        System.out.println(adress1.getAvenue());
        System.out.println(adress1.getCity());
        System.out.println(adress1.getPlaque());
        boolean equal = adress.isEqual(adress1);
        adress.isEqual(adress1);
        boolean equa2 = adress1.isEqual(adress);
        adress1.isEqual(adress);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void runQuestion4() {
        Contact contact = new Contact("arya", "09367405960", "1377.5.19");
        Contact contact1 = new Contact("hadifar", "09121567788");
        System.out.println(contact.getName());
        System.out.println(contact.getPhoneNnmber());
        System.out.println(contact.getDateOfBirth());
        System.out.println(contact1.getName());
        System.out.println(contact.getPhoneNnmber());
        contact.setName("varaste");
        contact.setPhoneNnmber("09128301521");
        contact.setDateOfBirth("1373.9.28");
        contact1.setName("moghimi");
        contact1.setPhoneNnmber("02122426292");
        System.out.println(contact.getName());
        System.out.println(contact.getPhoneNnmber());
        System.out.println(contact.getDateOfBirth());
        System.out.println(contact1.getName());
        System.out.println(contact.getPhoneNnmber());


    }

    private static void runQuestion5() {
        Machine machine = new Machine("samand");
        Machine machine1 = new Machine("peykan");
        Machine machine2 = new Machine("matiez");
        Machine machine3 = new Machine("bens");
        Machine machine4 = new Machine("ford");

        System.out.println(machine.getCurrentSpeed());
        System.out.println(machine.getId());
        System.out.println(machine.getName());
        System.out.println(machine1.getCurrentSpeed());
        System.out.println(machine1.getId());
        System.out.println(machine1.getName());

        System.out.println(machine2.getCurrentSpeed());
        System.out.println(machine2.getId());
        System.out.println(machine2.getName());

        System.out.println(machine3.getCurrentSpeed());
        System.out.println(machine3.getId());
        System.out.println(machine3.getName());

        System.out.println(machine4.getCurrentSpeed());
        System.out.println(machine4.getId());
        System.out.println(machine4.getName());
        machine.setCurrentDegree("45");
        machine1.setCurrentDegree("86");
        machine2.setCurrentDegree("31");
        machine3.setCurrentDegree("65");
        machine4.setCurrentDegree("50");


    }

}
