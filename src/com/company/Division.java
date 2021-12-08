package com.company;

public class Division {
    private int a;
    private int b;

    public double division1(int a, int b) throws ArithmeticException{
        return a/b ;
    }

    public int division2(int a, int b){
        int s = 0;
        try{
            s = a/b;
        }catch (ArithmeticException e){
            System.out.printf("Erreur de division");
        }
        return s;
    }

    public double division3(int a, int b) throws ArithmeticException{
        return a/b;
    }
}
