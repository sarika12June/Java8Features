package com.srikanth.fi.services.impl;

import com.srikanth.fi.dao.BooksDao;
import com.srikanth.fi.model.Books;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class BooksSort {

    public List<Books> getBooks(){
        List<Books> books=new BooksDao().getBooks();
        Collections.sort(books,(o1,o2) ->{
         return o1.getBooksName().compareTo(o2.getBooksName());
        });
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BooksSort().getBooks());
    }
}
