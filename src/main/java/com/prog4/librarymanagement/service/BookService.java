package com.prog4.librarymanagement.service;

import com.prog4.librarymanagement.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prog4.librarymanagement.repository.BookCrudOperations;

import java.util.List;

@Service
public class BookService {
    private BookCrudOperations bookRepository;
    @Autowired
    public BookService(BookCrudOperations bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> getAll(){
        return bookRepository.findAll();
    }
    public List<Book> saveAllBooks(List<Book> books){
        return bookRepository.saveAll(books);
    }
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public void deleteBook(Book bookId) {
        bookRepository.delete(bookId);
    }
}