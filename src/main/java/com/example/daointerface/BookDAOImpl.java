package com.example.daointerface;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.entity.Book;
import com.example.utility.HibernateUtility;


public class BookDAOImpl implements BookDAO {

	@Override
	public void saveBook(Book book) {
		 Session session = HibernateUtility.getSession();
	        Transaction tx = session.beginTransaction();
	        session.save(book);
	        tx.commit();
	        session.close();  
	}

	@Override
	public Book getBookById(int id) {
		Session session = HibernateUtility.getSession();
        Book book = session.get(Book.class, id);
        session.close();
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		Session session = HibernateUtility.getSession();
        List<Book> books = session.createQuery("from Book", Book.class).list();
        session.close();
        return books;

	}

	@Override
	public void updateBook(Book book) {
		Session session = HibernateUtility.getSession();
        Transaction tx = session.beginTransaction();
        session.update(book);
        tx.commit();
        session.close();
	}

	@Override
	public void deleteBook(int id) {
		 Session session = HibernateUtility.getSession();
	        Transaction tx = session.beginTransaction();
	        Book book = session.get(Book.class, id);
	        if (book != null) {
	            session.delete(book);
	        }
	        tx.commit();
	        session.close();
	    }
}
