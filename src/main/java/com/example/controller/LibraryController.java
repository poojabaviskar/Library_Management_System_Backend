package com.example.controller;

import java.util.Scanner;

import com.example.entity.Book;
import com.example.service.BookService;

public class LibraryController {
	
	private static BookService bookService = new BookService();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. View All Books");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
            case 1:
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                Book book = new Book();
                book.setTitle(title);
                bookService.addBook(book);
                System.out.println("Book added successfully!");
                break;
                
            case 2:
                System.out.print("Enter book ID: ");
                int id = scanner.nextInt();
                Book foundBook = bookService.findBookById(id);
                System.out.println(foundBook != null ? foundBook.getTitle() : "Book not found!");
                break;
                
            case 3:
                bookService.getAllBooks().forEach(b->System.out.println(b.getTitle()));
                break;
                
            case 4:
                System.out.print("Enter book ID to update: ");
                int updateId = scanner.nextInt();
                scanner.nextLine();
                Book updateBook = bookService.findBookById(updateId);
                if (updateBook != null) {
                    System.out.print("Enter new title: ");
                    updateBook.setTitle(scanner.nextLine());
                    bookService.updateBook(updateBook);
                    System.out.println("Book updated successfully!");
                } else {
                    System.out.println("Book not found!");
                }
            break;
            
         case 5:
            System.out.print("Enter book ID to delete: ");
            int deleteId = scanner.nextInt();
            bookService.deleteBook(deleteId);
            System.out.println("Book deleted successfully!");
            break;
            
        case 6:
            System.out.println("Exiting...");
            scanner.close();
            return;
        default:
            System.out.println("Invalid choice. Try again.");

            }
		}
	}
}
