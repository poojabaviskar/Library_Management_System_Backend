package com.example.entity;


import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	
	@ManyToMany
	@JoinTable(
		name="book_category",
		joinColumns = @JoinColumn(name="book_id"),
		inverseJoinColumns = @JoinColumn(name="category_id"))
	
	private List<Category>categories;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String title, Author author, List<Category> categories) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.categories = categories;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", categories=" + categories + "]";
	}
}
