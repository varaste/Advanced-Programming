package com.aut.hw2.question2;

public class Rectangle {
    public Rectangle(double width, double length) {

        this.width = width;
        this.length = length;

    }

    private double width, length;

    public void setWidth(double w) {
        width = w;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {

        return width * length;
    }

    public double calculatePerimeter() {
        return (width + length) * 2;
    }

    public boolean isSquare() {
        return width == length;

    }


    public boolean isEqual(Rectangle rect1) {
        if ((width == rect1.width && length == rect1.length || width == rect1.length && length == rect1.width)) {
            System.out.println("Two rectangles are equal");
            return true;
        } else {
            System.out.println("Two rectangles are not equal");
            return false;
        }

    }

}
