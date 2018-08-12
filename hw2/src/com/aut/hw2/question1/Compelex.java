package com.aut.hw2.question1;

public class Compelex {


    private double img1;
    private double real1;

    private Compelex(double real, double img) {
        this.img1 = img;
        this.real1 = real;
    }

    public Compelex() {
        this.img1 = 0;
        this.real1 = 0;
    }


    public double getImg1() {
        return img1;
    }

    public void setImg1(double img1) {
        this.img1 = img1;
    }

    public double getReal1() {
        return real1;
    }

    public void setReal1(double real1) {
        this.real1 = real1;
    }


    public Compelex add(Compelex comp1) {

        double real = this.real1 + comp1.getReal1();
        double img = this.img1 + comp1.getImg1();
        Compelex result = new Compelex(real1, img1);
        return result;

    }

    public Compelex subtraction(Compelex comp1) {

        double real = this.real1 - comp1.getReal1();
        double img = this.img1 - comp1.getImg1();
        Compelex result = new Compelex(real1, img1);
        return result;

    }

    public Compelex multiply(Compelex comp1) {

        double real = (this.real1 * comp1.getReal1()) - (this.img1 * comp1.getImg1());
        double img = (this.img1 * comp1.getReal1()) + (this.real1 * comp1.getImg1());
        Compelex result = new Compelex(real1, img1);
        return result;

    }

    public Compelex division(Compelex comp1) {

        double real = ((this.real1 * comp1.getReal1()) + (this.img1 * comp1.getImg1()))
                / ((comp1.getReal1() * comp1.getReal1()) + (comp1.getImg1() * comp1.getImg1()));
        double img = ((comp1.getReal1() * this.img1) - (this.real1 * comp1.getImg1()))
                / ((comp1.getReal1() * comp1.getReal1()) + (comp1.getImg1() * comp1.getImg1()));
        Compelex result = new Compelex(real1, img1);
        return result;

    }


    public boolean isEual(Compelex complex1) {
        if (this.real1 == complex1.getReal1() && this.img1 == complex1.getReal1()) {
            return true;
        } else {
            return false;
        }
    }

}
