package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class to demonstrate
 * Spring IoC Container.
 */
public class MainApp {
    public static void main(String[] args) {

        // Load Spring Configuration File
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve BookService bean from Spring Container
        BookService bookService =
                context.getBean("bookService", BookService.class);

        // Invoke service method
        bookService.displayBookInfo();
    }
}