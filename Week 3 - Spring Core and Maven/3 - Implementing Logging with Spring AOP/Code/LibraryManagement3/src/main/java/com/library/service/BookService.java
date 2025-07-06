package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bs;
	
	public void setBookRepository(BookRepository bs) {
		this.bs = bs;
	}
	
	public void listBooks() {
		System.out.println("Book Service..");
		bs.listBooks();
	}
	
}