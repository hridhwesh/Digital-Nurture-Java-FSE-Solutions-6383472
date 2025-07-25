package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	
	private BookRepository bookRepository;

	// Constructor for dependency injection
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	/*
	  // Setter for dependency injection public void
	  setBookRepository(BookRepository bookRepository) { this.bookRepository =
	  bookRepository; }
	 */
	public void bookServiceShow() {
		System.out.println("Inside BookService");
		bookRepository.bookRepositoryShow();
	}

}