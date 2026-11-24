package com.practice2.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
	String title;
	Book(String title){
		this.title = title;
	}
}
class Library{
	String name;
	List<Book> books;
	public Library(String name) {
		this.name = name;
		books = new ArrayList<Book>();
	}
	void addBooks(Book b) {
		books.add(b);
	}
	void displayBooks() {
		for(Book b : books) {
			System.out.println("in voidDisplay " + b.title);
			
		}
	}
}
class Driver{
	public static void main (String args[]) {
		Library l1 = new Library("it is central library");
		Book b1 = new Book("JRD");
		Book b2 = new Book("C++");
		Book b3 = new Book("Advanced Java");
		l1.displayBooks();
		l1.addBooks(b1);
		l1.addBooks(b2);
		l1.addBooks(b3);
		
	}
}
