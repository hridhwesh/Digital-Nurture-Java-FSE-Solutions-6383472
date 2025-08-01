package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bs = (BookService) context.getBean("bookService");
        bs.bookService();
        BookRepository br = (BookRepository) context.getBean("bookRepository");
        br.bookRepository();
        ((ClassPathXmlApplicationContext) context).close();
    }
}