package com.srikanth.fi.services.impl;

import com.srikanth.fi.services.CalculatorFunctionalInterfaceExample;

public class CalculatorFunctionalInterfaceExampleImpl {
    public static void main(String[] args) {
        CalculatorFunctionalInterfaceExample cfie= ( a,  b,  calculation)->{
            if(calculation.equals("SUM")){
                return  a+b;
            }else if(calculation.equals("SUBTRACT")){
                return b-a;
            }else{
                return 0;
            }
        };
        System.out.println(cfie.decide(10,10,"SUM"));
        System.out.println(cfie.decide(10,10,"SUBTRACT"));
    }

}
