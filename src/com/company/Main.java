package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Division division = new Division();
        try {
            System.out.println(division.division1(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Division impossible");
        }

        System.out.println(division.division2(10, 0));

        try {
            division.division3(3, 0);
        } catch (IOException e) {
            System.out.println("Erreur");
        }
        Factorielle f = new Factorielle();
        try {
            f.calcul("-3");
        } catch (IOException e) {
            System.out.println("ouch");
        } catch (FactorialNegativeArgumentExecption e){
            System.out.println(e.getMessage());
        }

    }
}
