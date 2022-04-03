package com.model;

import com.factory.BookFactory;
import com.factory.PersonFactory;

import java.util.HashSet;
import java.util.Set;


public class Database {

    private Set<Book> books;
    private Set<Person> persons;

    private BookFactory bookFactory = new BookFactory();
    private PersonFactory personFactory = new PersonFactory();

    public Database(){
        books = new HashSet<>();
        persons = new HashSet<>();

        Book book = bookFactory.createBook(1, "10 years later", "Duma");
        Book book2 = bookFactory.createBook(2, "two towers", "Tolkien");
        Book book3 = bookFactory.createBook(3, "Return of the King", "Tolkien");

        books.add(book);
        books.add(book2);
        books.add(book3);

        Person person = personFactory.createPerson(1,12,"John");
        Person person2 = personFactory.createPerson(2,44,"Joseph");

        persons.add(person);
        persons.add(person2);

    }

    public Person getPersonById(long id){
        for (Person person : persons){
            if(person.getId() == id){
                return person;
            }
        }
        throw new RuntimeException("No persons found with id : " + id);
    }

    public Book getBookId(long id){
        for(Book book: books){
            if(book.getId() == id){
                return book;
            }
        }
        throw new RuntimeException("No books founds with id : " + id);
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}
