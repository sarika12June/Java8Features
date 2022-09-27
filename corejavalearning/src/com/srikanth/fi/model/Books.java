package com.srikanth.fi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Books {

    private @Getter @Setter int booksId;
    private @Getter @Setter String booksName;
    private @Getter @Setter String authorId;
}
