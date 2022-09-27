package com.srikanth.fi.services.impl;

import com.srikanth.fi.services.FunctionalInterfaceExample;

public class FunctionalInterfaceExampleImpl {
    public static void main(String[] args) {
        FunctionalInterfaceExample fie=(name)->{
            return name ;
        };
        System.out.println(fie.sam("hello functional interface"));
    }
}
