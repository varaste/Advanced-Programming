package com.aut.hw3.question1;


public class ComplexNumber {

    private double img1;
    private double real1;

    private ComplexNumber(double real, double img) {
        this.img1 = img;
        this.real1 = real;
    }

    public ComplexNumber() {
        img1 = 0;
        real1 = 0;
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


    public ComplexNumber add(ComplexNumber comp1) {


        double real = this.real1 + comp1.getReal1();
        double img = this.img1 + comp1.getImg1();
        ComplexNumber result = new ComplexNumber(real1, img1);
        return result;

    }

    public ComplexNumber subtraction(ComplexNumber comp1) {

        double real = this.real1 - comp1.getReal1();
        double img = this.img1 - comp1.getImg1();
        ComplexNumber result = new ComplexNumber(real1, img1);
        return result;

    }

    public ComplexNumber multiply(ComplexNumber comp1) {

        double real = (this.real1 * comp1.getReal1()) - (this.img1 * comp1.getImg1());
        double img = (this.img1 * comp1.getReal1()) + (this.real1 * comp1.getImg1());
        ComplexNumber result = new ComplexNumber(real1, img1);
        return result;

    }

    public ComplexNumber division(ComplexNumber comp1) {

        double real = ((this.real1 * comp1.getReal1()) + (this.img1 * comp1.getImg1()))
                / ((comp1.getReal1() * comp1.getReal1()) + (comp1.getImg1() * comp1.getImg1()));
        double img = ((comp1.getReal1() * this.img1) - (this.real1 * comp1.getImg1()))
                / ((comp1.getReal1() * comp1.getReal1()) + (comp1.getImg1() * comp1.getImg1()));
        ComplexNumber result = new ComplexNumber(real1, img1);
        return result;

    }


    public boolean isEual(ComplexNumber complex1) {
        if (this.real1 == complex1.getReal1() && this.img1 == complex1.getReal1()) {
            return true;
        } else {
            return false;
        }
    }

}



