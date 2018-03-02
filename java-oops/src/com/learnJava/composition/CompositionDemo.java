package com.learnJava.composition;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {

        Book book = new Book();
        book.setAuthor("ABC");
        book.setTitle("Learn Java");


        Library library = new Library();
        library.setName("ABC");

        List<Book> books = new ArrayList<>();
        books.add(book);


        library.setBooks(books);

        System.out.println("Book is : " + book);

        System.out.println("Library is : " + library);

    }
}
