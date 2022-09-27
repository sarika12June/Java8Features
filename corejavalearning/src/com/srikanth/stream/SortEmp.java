package com.srikanth.stream;

import com.srikanth.stream.dao.EmployeeSalary;
import com.srikanth.stream.model.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmp {
    public static void main(String[] args) {

        List<Employee>list=EmployeeSalary.getEmployees();
        Collections.sort(list,(emp,emp1)-> (int) (emp1.getSalary() -emp.getSalary()));
       // System.out.println("general sorting with stream "+list);
        list.stream().sorted((emp,emp1)-> (int) (emp1.getSalary() -emp.getSalary())).forEach(t ->{
            //System.out.println("from stream "+t.getEmpName());
        });
        list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(t->{
            System.out.println(" using functional reference "+t);
        });

    }
}
