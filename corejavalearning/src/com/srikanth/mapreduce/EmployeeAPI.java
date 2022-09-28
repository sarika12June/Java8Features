package com.srikanth.mapreduce;

import com.srikanth.mapreduce.dao.EmployeeDAO;
import com.srikanth.mapreduce.model.Employee;

public class EmployeeAPI {
    public static void main(String[] args) {
       Double avgSal= EmployeeDAO.getAllEmployee().stream().filter(employee -> employee.getGradle()
                .equalsIgnoreCase("A")).map(employee -> employee.getSalary()).mapToDouble(i->i).average().getAsDouble();
        System.out.println(avgSal);
        Double sumSal= EmployeeDAO.getAllEmployee().stream().filter(employee -> employee.getGradle()
                .equalsIgnoreCase("A")).map(employee -> employee.getSalary()).mapToDouble(i->i).sum();
        System.out.println(sumSal);

    }
}
