package com.aut.hw2.question2;

public class Circle {


    private double radius;
/*
    public void setRadius(double r) {
        radius = r;
    }
*/

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14159 * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14159 * radius;
    }

    public boolean isEqual(javafx.scene.shape.Circle cir) {

        if (radius == cir.getRadius()) {/////////maybe it is right
            return true;
        } else {
            return false;
        }
    }

}
