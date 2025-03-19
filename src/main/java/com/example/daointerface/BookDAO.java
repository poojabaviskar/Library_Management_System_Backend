package com.example.daointerface;

import java.util.List;

import com.example.entity.Book;

public interface BookDAO {
	
	void saveBook(Book book);
	Book getBookById(int id);
	List<Book>getAllBooks();
	void updateBook(Book book);
	void deleteBook(int id);
}
