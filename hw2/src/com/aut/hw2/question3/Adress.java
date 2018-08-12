package com.aut.hw2.question3;

public class Adress {

    public Adress(String city, String avenue, String plaque, String apartment) {

        this.plaque = plaque;
        this.city = city;
        this.avenue = avenue;
        this.apartment = apartment;
    }

    public Adress(String city, String avenue, String plaque, String apartment, String number) {

        this.plaque = plaque;
        this.city = city;
        this.avenue = avenue;
        this.number = number;
        this.apartment = apartment;
    }


    private String plaque;
    private String avenue;
    private String city;
    private String number;
    private String apartment;


    public String getApartment() {
        return apartment;
    }

    public String getPlaque() {
        return plaque;
    }

    public String getNumber() {
        return number;
    }

    public String getAvenue() {
        return avenue;
    }

    public String getCity() {
        return city;
    }


    public boolean isEqual(Adress adress1) {
        if ((this.plaque == adress1.getPlaque()) && (this.avenue == adress1.getAvenue())
                && (this.city == adress1.getCity()) && (this.number == adress1.getNumber())) {
            return true;
        } else {
            return false;

        }
    }


}



