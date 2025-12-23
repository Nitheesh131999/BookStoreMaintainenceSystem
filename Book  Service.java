package com.nitheeshkumar.Programms.bookmaintainance.service;

import org.springframework.stereotype.Service;

import com.nitheeshkumar.Programms.bookmaintainance.entity.Book;
import com.nitheeshkumar.Programms.bookmaintainance.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book saveBook(Book book) {
        return repo.save(book);
    }

    public Book getBookById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}