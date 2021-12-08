package com.company;

public class Main {

    public static void main(String[] args) {
        Division division = new Division();
        try{
            System.out.println(division.division1(10,0));
        }catch (ArithmeticException e){
            System.out.println("Division impossible");
        }

        System.out.println(division.division2(10,0));

        try{
            System.out.println(division.division3(3,0));
        }catch (ArithmeticException e){
            System.out.printf("Division impossible");
        }
    }
}
