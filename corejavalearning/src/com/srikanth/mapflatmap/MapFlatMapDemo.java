package com.srikanth.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDemo {
    public static void main(String[] args) {
        List<String> emails=CustomerDAO.getCustomers().stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        emails.stream().forEach(i ->{
            System.out.println("using map "+i);
        });

        List<String> pheNumber=CustomerDAO.getCustomers().stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        pheNumber.stream().forEach(i ->{
            System.out.println("using flat map "+i);
        });

    }
}
