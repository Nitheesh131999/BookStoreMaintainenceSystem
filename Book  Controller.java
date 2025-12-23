package com.nitheeshkumar.Programms.bookmaintainance.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.nitheeshkumar.Programms.bookmaintainance.entity.Book;
import com.nitheeshkumar.Programms.bookmaintainance.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return service.getBookById(id);
    }

    @PostMapping
    public Book createBook(@Validated @RequestBody Book book) {
        return service.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return "Book deleted successfully";
    }
}