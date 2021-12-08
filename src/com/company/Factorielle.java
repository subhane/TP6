package com.company;

import java.io.IOException;

public class Factorielle {

    public long calcul(String val) throws IOException, FactorialNegativeArgumentExecption, FactorialTooLargeArgumentException{
        long valeurf = 0;
        try{
            long x = Long.parseLong(val);
            for(int i=1;i<=x ;i++ ) {
                x *= i;
            }
                valeurf = x;
                return x;
        }catch(NullPointerException e){
                throw new IOException("Le parametre "+val+" est null");
        }catch (NumberFormatException e){
                throw new IOException("Le parametre " +val+ " n'est pas un nombre");
        }
        if(valeurf<0){
            throw new FactorialNegativeArgumentExecption(valeurf);
        }
        if(valeurf>20) {
            throw new FactorialTooLargeArgumentException(valeurf);
        }

    }
}
