package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            Division division = new Division(10,0);
            System.out.println(division.division1());
        }catch (ArithmeticException e){
            System.out.println("Division impossible");
        }
    }
}
