package com.srikanth.cpsf;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class Consumerdemo {

    public static void main(String[] args) {
        Consumer consumer = t ->{
            System.out.println("consumer value is "+t);
        };
        consumer.accept(10);

        List<Integer>list =Arrays.asList(10,20,30,40);
        list.stream().forEach(t->{
            System.out.println("consumer values are "+t);
        });

    }
}
