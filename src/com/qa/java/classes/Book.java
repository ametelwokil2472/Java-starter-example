package com.qa.java.classes;

public class Book {
	
		 public String title; //
		 public int noOfPages; //
		 public String author; //
		 public boolean isOnline;
		 public String type; 
		 
		 public Book(String title, int noOfPages, String type) {
			 this.title = title;
			 this.noOfPages = noOfPages;
			 this.type = type;
			 } 
		 
		 public String read() {
			 return this.title + " has " +this.noOfPages + "its type is" + this.type;
			 }
}
