package com.aut.hw2.question2;


public class Square {

    public Square(double length) {

        this.length = length;
    }

    private double length;

    /*
            public void setLength(int l) {
                length = l;
            }
    */
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateArea() {

        return length * length;
    }

    public double calculatePerimeter() {

        return (length) * 4;
    }

    public boolean isEqual(Square squ1) {

        if (length == squ1.length) {
            return true;
        } else {
            return false;
        }
    }

}


