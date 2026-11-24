package com.practice;

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
		// TODO Auto-generated constructor stub
	}
	 void addBook(Book b) {
		 books.add(b);
	 }
	 void displayBooks() {
		 System.out.println("Library ," + name);
		 for (Book b1 : books) {
			 System.out.println("pass via b1.title "+b1.title);
		 }
	 }
 }
  class Driver{
	 public static void main (String args[]) {
		 Library l1 = new Library("Central Library");
		 Book b2 = new Book("c++");
		 Book b3 = new Book("java");
		 Book b4 = new Book("Advanced java ");
		 l1.addBook(b2);
		 l1.addBook(b3);
		 l1.addBook(b4);
		 
		 l1.displayBooks();
	 }
 }
