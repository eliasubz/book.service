package com.ass6.catalogapi.service;

import com.ass6.catalogapi.api.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CatalogService {
    private static List<Book> bookList;;

    public CatalogService() {
        bookList = new ArrayList<>();

        Book book1 = new Book(1, "1984", "George orwell", 1949 );
        Book book2 = new Book(2, "The Great Gatsby", "F. Scott Fitzgerald", 1925 );
        Book book3 = new Book(3, "The Scarlet Letter", "Nathaniel Hawthorne", 1850 );
        Book book4 = new Book(4, "The Catcher in the Rye", "J. D. Salinger", 1951 );
        Book book5 = new Book(5, "Adventures of Huckleberry Finn", "Mark Twain", 1884 );

        bookList.addAll(Arrays.asList(book1,book2,book3,book4,book5));
    }

    public static List<Book> findAll() {
        return bookList;
    }

    public Optional<Book> getBook(Integer id) {
        Optional optional = Optional.empty();
        for (Book book: bookList) {
            if(id == book.getId()) {
                optional = Optional.of(book);
                return optional;
            }
        }
        return optional;
    }

    public void addBook(Book book) {
        bookList.add(book);
    } //toDo notify inventory

    public void deleteBook(Book book) {
        bookList.remove(book);
    }

    public void updateBook(int id, Book book) {
        Book currentBook = (Book) getBook(id).get();
        currentBook = book;
    }
}
