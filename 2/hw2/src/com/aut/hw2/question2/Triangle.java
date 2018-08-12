package com.aut.hw2.question2;

public class Triangle {

    public Triangle(double length1, double length2, double length3) {

        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    private double length1, length2, length3;

    /*
        public void setLength(double l, double m, double n) {
            length1 = l;
            length2 = m;
            length3 = n;
        }
    */
    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }

    public void setLength3(double length3) {
        this.length3 = length3;
    }

    public double calculateArea() {

        double p = ((length1 + length2 + length3) / 2);
        return Math.sqrt((p) * (p - length1) * (p - length2) * (p - length3));
    }

    public double calculatePerimeter() {
        return (length1 + length2 + length3);
    }

    public void equilateralTriangle() {
        if ((length2 == length1) && (length3 == length1) && (length2 == length3)) {
            System.out.println("equilateral Triangle");
        } else {
            System.out.println(" not equilateral Triangle");
        }
    }

    public void isoscelesTriangle() {
        if ((length2 == length1) || (length3 == length1) || (length2 == length3)) {
            System.out.println(" isosceles Triangle");
        } else {
            System.out.println(" not isosceles Triangle");
        }
    }

    public boolean isEqual(Triangle tri1) {
        if ((length1 == tri1.length1 && length2 == tri1.length2 && length3 == tri1.length3 ||
                length1 == tri1.length2 && length2 == tri1.length3 && length3 == tri1.length1 ||
                length1 == tri1.length3 && length2 == tri1.length1 && length3 == tri1.length2)) {
            return true;
        } else {
            return false;
        }

    }


    public void setLength2() {
    }
}
