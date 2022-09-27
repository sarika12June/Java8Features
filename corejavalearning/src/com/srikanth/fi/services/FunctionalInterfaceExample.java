package com.srikanth.fi.services;


@FunctionalInterface
public interface FunctionalInterfaceExample {
    String sam(String name);
    default String defaultMethod(){
        return "defaultMethod";
    };
    static String staticMethod(){
        return "staticMethod";
    };
}
