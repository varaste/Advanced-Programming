package com.company;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {



    }





    public static void leapYear() {

        System.out.println("A program that recognizes leap year or not");
        Scanner input = new Scanner(System.in);
        int inputYearNum = input.nextInt();
        int myLeapYear = 1317;

        int distance = inputYearNum - myLeapYear;
        if (distance % 4 == 0) {
            System.out.println("It's a leap year\n");
        } else {
            System.out.println("Not a leap year\n");
        }
    }



    public static void spell(){

        System.out.println("A program that Spell out numbers");
        Scanner input = new Scanner(System.in);
        int inputNum = input.nextInt();




            if (inputNum < 10) {

                switch (inputNum) {
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;

                }
            }


        if (inputNum <20){
            switch (inputNum) {
                case 10 :
                    System.out.println("ten");
                    break;
                case 2 :
                    System.out.println("elevn");
                    break;
                case 12 :
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14 :
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16 :
                    System.out.println("sixteen");
                    break;
                case 17 :
                    System.out.println("seventeen");
                    break;
                case 18 :
                    System.out.println("eightteen");
                    break;
                case 19 :
                    System.out.println("nineteen");
                    break;

            }
        }
        else
        if (inputNum <100){
            switch (inputNum) {
                case 20 :
                    System.out.println("twenty");
                    break;
                case 30 :
                    System.out.println("thirty ");
                    break;
                case 40 :
                    System.out.println("forty ");
                    break;
                case 50:
                    System.out.println("fifty ");
                    break;
                case 60 :
                    System.out.println("sixty ");
                    break;
                case 70:
                    System.out.println("seventy ");
                    break;
                case 80 :
                    System.out.println("eighty ");
                    break;
                case 90 :
                    System.out.println("ninety ");
                    break;
                case 100:
                    System.out.println("one hundred");
                    break;

            }
    }





    


    public static int[] inputNumbre() {
        String myString = "94";
        Scanner myScanner = new Scanner(System.in);
        System.out.println(myString);
        String a = "adad vared konid";
        System.out.println(a);
        int[] number = new int[100];
        for (int i = 0; i < 7; i++) {
            number[i] = myScanner.nextInt();
        }
        return number;
    }

    public static  int [] fix94 (int[] number) {

        int temp;
        int p=0;
        for (int i = 0; i < 7; i++) {
            if (number[i] == 9) {
                for (int j = p; j < 7; j++) {
                    if (number[j] == 4) {
                        temp = number[j];
                        number[j] = number[i + 1];
                        number[i + 1] = temp;
                        p=i+2;
                    }
                }
            }
        }
        for (int k = 0; k < 7; k++) {
            System.out.println(number[k]);
        }
        return number;
    }







    public static void cl() {

        Scanner myScanner = new Scanner(System.in);

        int x1, y1, x2, y2, o, n1, n2;
        n1 = n2 = 0;

        x1 = myScanner.nextInt();
        y1 = myScanner.nextInt();
        x2 = myScanner.nextInt();
        y2 = myScanner.nextInt();
        o = myScanner.nextInt();

        if (o == 0) {
            n1 = x1 + x2;
            n2 = y1 + y2;
            System.out.println(n1 + " " + n2 + "i");

        }

        if (o == 1) {
            n1 = x1 - x2;
            n2 = y1 - y2;
            System.out.println(n1 + " " + n2 + "i");
        }

        if (o == 2) {
            n1 = x1 * x2 - y1 * y2;
            n2 = x1 * y2 + +x2 * y1;
            System.out.println(n1 + " " + n2 + "i");
        }

        if (o == 3) {
            n1 = (x1 * x2 + y1 * y2) / x2 * x2 + y2 * y2;
            n2 = (x2 * y1 - x1 * y2) / x2 * x2 + y2 * y2 ;
            System.out.println(n1 + " " + n2 + "i");
        }
    }
}


