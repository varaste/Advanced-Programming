package com.aut.hw2.question5;


public class Machine {
    private static final double TURN_LEFT = 90.0;
    private static double TURN_RIGHT = -90.0;
    private static double maxSpeed = 0;
    private static int id;
    private double currentSpeed;
    private String currentDegree;
    private String name;


    public Machine(String name) {
        name = name;
    }

    public Machine() {
        String name = this.name;
    }


    public double getCurrentSpeed()

    {
        return currentSpeed;
    }

    public String getName()

    {
        return name;
    }


    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
        if (currentSpeed > maxSpeed) {
            maxSpeed = currentSpeed;
        }
    }

    public void setCurrentDegree(String currentDegree) {
        this.currentDegree = currentDegree;
    }


    public void turn(double degree) {
        currentDegree = currentDegree + degree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
