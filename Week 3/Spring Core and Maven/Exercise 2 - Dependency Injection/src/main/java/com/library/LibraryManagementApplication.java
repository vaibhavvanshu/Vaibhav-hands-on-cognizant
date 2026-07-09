package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class to demonstrate
 * Dependency Injection using Spring IoC Container.
 */
public class LibraryManagementApplication {
    public static void main(String[] args) {

        // Load Spring Configuration File
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve BookService bean
        BookService service =
                context.getBean("bookService", BookService.class);

        // Invoke service method
        service.issueBook();
    }
}