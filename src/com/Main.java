package com;

import com.model.Book;
import com.model.Database;
import com.model.Person;
import com.service.BookLendingService;
import com.service.ReportService;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Database database = new Database();
        ReportService reportService = new ReportService(database);
        BookLendingService bookLendingService = new BookLendingService();

        Person person = database.getPersonById(1);
        Book book = database.getBookId(1);
        bookLendingService.reserveBook(book, person);

        System.out.println(reportService.displayAvailableBooks());
        System.out.println("\n \n \n \n");
        System.out.println(reportService.displayAllBooks());

    }
}
