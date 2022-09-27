package com.srikanth.cpsf;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;

public class Predicatedemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate= t ->t%2 == 0;
        System.out.println(predicate.test(7));

        List<Integer> list= Arrays.asList(11,20,31,40);
        list.stream().filter(t->t%2 ==0).forEach(t-> System.out.println(t));
    }
}
