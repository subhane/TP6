package com.company;

public class FactorialNegativeArgumentExecption extends Exception{

    public FactorialNegativeArgumentExecption(long val){
        super("Le nombre " +val+ " est negatif");
    }
}
