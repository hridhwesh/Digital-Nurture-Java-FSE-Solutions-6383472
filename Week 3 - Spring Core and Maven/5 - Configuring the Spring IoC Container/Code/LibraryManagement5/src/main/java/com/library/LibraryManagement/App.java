package com.library.LibraryManagement;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the service bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the dependency
        bookService.addBook("The Great Gatsby");
    }
}
