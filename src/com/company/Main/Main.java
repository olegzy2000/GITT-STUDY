package com.company.Main;

import com.company.Books.Book;
import com.company.BooksSortedHelper.BooksSortetHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<Book>();
        list.add(new Book("A",5,1));
        list.add(new Book("B",3,2));
        list.add(new Book("C",2,3));
        BooksSortetHelper.printSortedByCost(list);
    }
}
