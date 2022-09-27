package com.srikanth.stream;

import com.srikanth.stream.model.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMap {

    public static void main(String[] args) {
        Map<Employee,Integer> map=new HashMap<>();
        map.put(new Employee(101,"Srikannth","IT","Hyderabad", 920000),10);
        map.put(new Employee(102,"Sarika","HR","Bangalore", 700000),20);
        map.put(new Employee(103,"Aadhya","Finance","Kerala", 600000),30);
        map.put(new Employee(104,"Vijaya","Admin","Chennai", 900000),40);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(i-> System.out.println("map "+i));
    }
}
