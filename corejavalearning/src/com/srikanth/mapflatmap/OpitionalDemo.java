package com.srikanth.mapflatmap;

import java.util.Arrays;
import java.util.Optional;

public class OpitionalDemo {

    public static Customer getAllCustomer(String email) throws Exception {
        return CustomerDAO.getCustomers().stream().filter(customer ->customer.getEmail().equals(email)).findAny()
                .orElseThrow(()->new Exception("no email"));

    }
    public static void main(String[] args) throws Exception {
       Customer customer= new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));
        Optional emptyOptioanl= Optional.empty();
        System.out.println(emptyOptioanl);
       /* Optional<String> optionalEmail= Optional.of(customer.getEmail());
        System.out.println("optionalEmail  "+optionalEmail);*/
        Optional<String> optionalEmail2= Optional.ofNullable(customer.getEmail());
       // System.out.println("optionalEmail2  "+optionalEmail2.orElseThrow(()->new IllegalArgumentException("Exception for email")));
        System.out.println("optionalEmail2  "+optionalEmail2.map(String::toUpperCase).orElseGet(()->"default mail"));
        OpitionalDemo.getAllCustomer("bncd");


    }
}
