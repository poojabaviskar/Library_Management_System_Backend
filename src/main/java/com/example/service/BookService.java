package com.example.service;

import java.util.List;
import com.example.daointerface.BookDAO;
import com.example.daointerface.BookDAOImpl;
import com.example.entity.Book;

public class BookService {
	
	private BookDAO bookDAO = new BookDAOImpl();
	
	public void addBook(Book book) {
		bookDAO.saveBook(book);
	}
	
	public Book findBookById(int id) {
		return bookDAO.getBookById(id);
	}
	
	public List<Book> getAllBooks(){
		return bookDAO.getAllBooks();
		
	}
	
	public void updateBook(Book book) {
		bookDAO.updateBook(book);
	}
	
	public void deleteBook(int id) {
		bookDAO.deleteBook(id);
	}
}
