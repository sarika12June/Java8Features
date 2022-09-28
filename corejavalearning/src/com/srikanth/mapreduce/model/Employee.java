package com.srikanth.mapreduce.model;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String  gradle;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(gradle, employee.gradle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gradle, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gradle='" + gradle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGradle() {
        return gradle;
    }

    public void setGradle(String gradle) {
        this.gradle = gradle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(int id, String name, String gradle, double salary) {
        this.id = id;
        this.name = name;
        this.gradle = gradle;
        this.salary = salary;
    }
}
