package com.company;

public class FactorialTooLargeArgumentException extends Exception{

    public FactorialTooLargeArgumentException(long val){
        super("Le nombre "+val+" est trop grand");
    }
}
