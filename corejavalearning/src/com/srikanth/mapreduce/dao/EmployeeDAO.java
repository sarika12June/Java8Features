package com.srikanth.mapreduce.dao;

import com.srikanth.mapreduce.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDAO {
    public static List<Employee> getAllEmployee(){
        return Stream.of(
                new Employee( 101, "srikanth","A", 90000),
                new Employee( 103, "Sarika","A", 80000),
                new Employee( 102, "Aadhya","B", 6000)

        ).collect(Collectors.toList());
    }

    public static List<Employee> getAllEmployee2(){
        List<Employee> emp=new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            emp.add(new Employee(i,i+"emplyee","A",Double.valueOf(new Random().nextInt(1000)*100)));
        }
        return emp;
    }
}
