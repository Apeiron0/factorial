package com.example.victor.factorial;

/**
 * Created by victor on 11/02/15.
 */
public class fact {

    public Integer f_calc(Integer x){
        int resultado=1;

        do {
            resultado=resultado*x;

            x=x-1;
        }
        while (x>0);


        return  resultado;
    }
}
