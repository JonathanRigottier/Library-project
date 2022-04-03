package com.factory;

import com.model.Book;

public class BookFactory {

    public Book createBook(long id, String title, String author) {
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setAuthor(author);
        return book;
    }

}
