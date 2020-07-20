package com.company.BooksSortedHelper;

import com.company.Books.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class BooksSortetHelper {
    public static void printSortedByCost(ArrayList<Book>list){
        list.stream().sorted((z,c)-> {
            Integer cost1=z.getCost();
            Integer cost2=c.getCost();
            return cost1.compareTo(cost2);
        }).forEach(s->System.out.println(s));
    }
}

