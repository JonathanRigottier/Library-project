package com.service;

import com.model.Book;
import com.model.Database;

import java.util.HashSet;
import java.util.Set;

public class ReportService {

    private Database database;

    public ReportService(Database database) {
        this.database = database;
    }

    public Set<Book> displayAllBooks(){
        return database.getBooks();
    }

    public Set<Book> displayAvailableBooks (){
        Set<Book> allBooks = database.getBooks();
        Set<Book> availableBooks = new HashSet<>();

        //for each
        for(Book book : allBooks){

            //check book is free
            if(book.getPerson() == null){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

}
