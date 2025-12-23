package com.nitheeshkumar.Programms.bookmaintainance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitheeshkumar.Programms.bookmaintainance.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}