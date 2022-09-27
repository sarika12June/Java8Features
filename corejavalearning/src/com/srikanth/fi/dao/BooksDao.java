package com.srikanth.fi.dao;

import com.srikanth.fi.model.Books;

import java.util.ArrayList;
import java.util.List;

public class BooksDao {

    public List<Books> getBooks(){
        List<Books> books =new ArrayList<>();
        books.add(new Books(101,"A_Java","Srikanth"));
        books.add(new Books(102,"B_JavaScript","Sarika"));
        books.add(new Books(103,"C_React","Aadhya"));
        books.add(new Books(104,"D_Oracle","Vijaya"));
        return books;
    }
}
