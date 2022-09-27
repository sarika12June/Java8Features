package com.srikanth.stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sarika");
        list.add("Aadhya");
        list.add("Srikanth");
        list.add("Vijaya");

        list.stream().filter(i->i.contains("h")).forEach(i-> System.out.println("list  filter "+i));

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Sarika");
        map.put(2,"Aadhya");
        map.put(3,"Srikanth");
        map.put(4,"Vijaya");

     map.entrySet().stream().filter(t->t.getValue().contains("V")).forEach(i-> System.out.println("map filter "+i.getValue()));
    }
}
