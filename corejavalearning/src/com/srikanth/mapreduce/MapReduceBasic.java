package com.srikanth.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceBasic {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,3,4);
        int sumOfValues=arr.stream().mapToInt(i->i).sum();
        System.out.println("using map"+sumOfValues);
        int sumOfValues1=arr.stream().reduce(0,(a,b)->a+b);
        System.out.println("using reduce "+sumOfValues1);
        Optional<Integer>opt=arr.stream().reduce(Integer::sum);
        System.out.println("using mehtod reference "+opt.get());
        int sumOfValues3=arr.stream().reduce(1,(a,b)->a*b);
        System.out.println("using reduce mul; "+sumOfValues3);
        Integer maxValue=arr.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(maxValue);
        Integer maxValueMehodRef=arr.stream().reduce(Integer::max).get();
        System.out.println(maxValueMehodRef);
    }
}
