package com.srikanth.cpsf;

import java.util.function.Supplier;
import java.util.List;
import java.util.Arrays;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier =() -> "response from supplier ";
        System.out.println(supplier.get());

        List<String> list =Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->"no values"));


    }
}
