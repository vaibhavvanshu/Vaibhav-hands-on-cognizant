package com.library;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ivek5
 **/
public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = context.getBean("bookService", BookService.class);

        service.issueBook();
    }
}

/**
 * OUTPUT
 * Book Service is processing the request.
 * Fetching book details from the repository.
 * Book issued successfully.
 * ----------------------------------------
 * Method Executed : issueBook
 * Execution Time  : 8 ms
 * ----------------------------------------
 */