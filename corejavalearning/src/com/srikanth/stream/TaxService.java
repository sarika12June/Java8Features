package com.srikanth.stream;

import com.srikanth.stream.dao.EmployeeSalary;
import com.srikanth.stream.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static void main(String[] args) {
        List<Employee> list=EmployeeSalary.getEmployees().stream().filter(emp->emp.getSalary() >= 900000).collect(Collectors.toList());
        list.stream().forEach(t-> System.out.println("taxable user "+t));
        System.out.println("------------------------------------");
        List<Employee> list1=EmployeeSalary.getEmployees().stream().filter(emp->emp.getSalary() < 900000).collect(Collectors.toList());
        list1.stream().forEach(t-> System.out.println("non taxable user "+t));

    }
}
