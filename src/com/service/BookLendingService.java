package com.service;

import com.model.Book;
import com.model.Person;

import java.sql.Date;

public class BookLendingService {


    private static final int TWO_WEEKS = 1000 * 3600 * 24 * 14;

    public void reserveBook (Book book, Person person){
        if(book.getPerson() != null){
            throw new RuntimeException("Book: " + book.getTitle()
            + "already reserved !");
        }
        book.setPerson(person);
        book.setUntil(new Date(System.currentTimeMillis() + TWO_WEEKS));
    }

    public void returnBook (Book book){
        book.setPerson(null);
        book.setUntil(null);
    }

}
