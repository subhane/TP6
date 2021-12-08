package com.company;

public class Division {
    private int a;
    private int b;

    public Division(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double division1() throws ArithmeticException{
        return a/b ;
    }
}
