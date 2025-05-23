package org.example.demoapp;

import java.util.List;

public interface BookRepository {
    // dodajte potpis metode za dohvaćanje svih knjiga
    List<Book> findAll();

    Book findById(int id);
    void save(Book book);
    void deleteById(int id);
}