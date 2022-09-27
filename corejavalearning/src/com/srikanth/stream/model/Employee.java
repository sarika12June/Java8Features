package com.srikanth.stream.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private  @Getter @Setter  int empId;
    private  @Getter @Setter  String empName;
    private  @Getter @Setter  String dept;
    private  @Getter @Setter String empAddress;
    private  @Getter @Setter  long salary;
}
