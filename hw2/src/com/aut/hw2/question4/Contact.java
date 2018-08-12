package com.aut.hw2.question4;

public class Contact {


    private String name;
    private String phoneNnmber;
    private String dateOfBirth;


    public Contact(String name, String phoneNnmber, String dateOfBirth) {

        this.name = name;
        this.phoneNnmber = phoneNnmber;
        this.dateOfBirth = dateOfBirth;

    }

    public Contact(String name, String phoneNnmber) {

        this.name = name;
        this.phoneNnmber = phoneNnmber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNnmber() {
        return phoneNnmber;
    }

    public void setPhoneNnmber(String phoneNnmber) {
        this.phoneNnmber = phoneNnmber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}