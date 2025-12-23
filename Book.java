package com.nitheeshkumar.Programms.bookmaintainance.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Size(max = 250)
    private String title;

    @NotBlank(message = "Author is mandatory")
    @Size(max = 100)
    private String author;

    @Min(value = 1, message = "Price must be positive")
    private int price;

    @PastOrPresent(message = "Published date cannot be in the future")
    private java.sql.Date publishedDate;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public java.sql.Date getPublishedDate() {
		return publishedDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublishedDate(java.sql.Date publishedDate) {
		this.publishedDate = publishedDate;
	}

    // getters and setters
    
    
    
}