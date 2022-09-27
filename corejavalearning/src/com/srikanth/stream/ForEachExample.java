package com.srikanth.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sarika");
        list.add("Aadhya");
        list.add("Srikanth");
        list.add("Vijaya");

        list.stream().forEach(i-> System.out.println("For each consumer values are "+i));

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Sarika");
        map.put(2,"Aadhya");
        map.put(3,"Srikanth");
        map.put(4,"Vijaya");

        map.entrySet().forEach(i-> System.out.println("for each map key is "+i.getKey()+" values is "+i.getValue() ));
    }
}
