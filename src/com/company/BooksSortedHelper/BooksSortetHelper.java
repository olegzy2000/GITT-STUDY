package com.company.BooksSortedHelper;

import com.company.Books.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class BooksSortetHelper {
    public static void printSortedByCost(ArrayList<Book>list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).getCost()<list.get(j).getCost()){
                    Book book=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,book);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
