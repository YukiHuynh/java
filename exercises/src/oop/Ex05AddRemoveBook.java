package oop;

import java.util.ArrayList;

import bean.Book;

public class Ex05AddRemoveBook {

	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter","J.K.Rowlling", "9781408883785");
		Book book2 = new Book("A Man Called Ove","Fredrik Backman","9781444775808");
		
		Book.addBook(book1);
		Book.addBook(book2);
		
		ArrayList<Book> bookCollection = Book.getBookCollection();
		System.out.println("List of books: ");
		
		for(Book book : bookCollection) {
			System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getiSBN());
		}
		
		Book.removeBook(book1);
		System.out.println("\nAfter removing " + book1.getTitle() + ": ");
		System.out.println("List of books: ");
		
		for(Book book : bookCollection) {
			System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getiSBN());
		}		
	}
	
}
