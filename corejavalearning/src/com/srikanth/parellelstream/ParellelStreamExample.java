package com.srikanth.parellelstream;

import java.util.List;
import java.util.stream.IntStream;
import com.srikanth.mapreduce.dao.EmployeeDAO;
import com.srikanth.mapreduce.model.Employee;

public class ParellelStreamExample {
    public static void main(String[] args) {
        long startTime=0;
        long endTime=0;
      /*  startTime= System.currentTimeMillis();
        IntStream.range(1,1).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Sequence stream mill seconds "+(endTime-startTime));
        System.out.println("---------------------");
        startTime= System.currentTimeMillis();
        IntStream.range(1,1).parallel().forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Parellel stream mill seconds "+(endTime-startTime));*/

        List<Employee> employees= EmployeeDAO.getAllEmployee2();
        System.out.println("---------------------");
        startTime= System.currentTimeMillis();
        Double avgSingleStream=employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        endTime = System.currentTimeMillis();
        System.out.println("normal stream mill seconds "+(endTime-startTime) +"-----"+avgSingleStream );

        System.out.println("---------------------");
        startTime= System.currentTimeMillis();
        Double avgParellStream=employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        endTime = System.currentTimeMillis();
        System.out.println("avgParellStream stream mill seconds "+(endTime-startTime)+"-----"+avgParellStream );



    }
}
