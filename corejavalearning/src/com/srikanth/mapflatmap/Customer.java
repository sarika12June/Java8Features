package com.srikanth.mapflatmap;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private @Getter @Setter int id;
    private @Getter @Setter String name;
    private @Getter @Setter  String email;
    private @Getter @Setter List<String> phoneNumbers;
}
