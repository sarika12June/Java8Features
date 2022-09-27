package com.srikanth.stream.dao;

import com.srikanth.stream.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalary {
    public static List<Employee> getEmployees(){
        List<Employee> list =new ArrayList<>();
        list.add(new Employee(101,"Srikannth","IT","Hyderabad", 920000));
        list.add(new Employee(102,"Sarika","HR","Bangalore", 700000));
        list.add(new Employee(103,"Aadhya","Finance","Kerala", 600000));
        list.add(new Employee(104,"Vijaya","Admin","Chennai", 900000));
        return list;
    }
}
