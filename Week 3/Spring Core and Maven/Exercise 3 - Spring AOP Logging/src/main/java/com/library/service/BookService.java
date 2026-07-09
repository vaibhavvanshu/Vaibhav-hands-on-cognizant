package com.library.service;
import com.library.repository.BookRepository;
/**
 * @author ivek5
 **/

//Service Class containing Business Logic.
public class BookService {
    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void issueBook() {
        System.out.println("Book Service is processing the request.");
        bookRepository.getBookDetails();
        System.out.println("Book issued successfully.");
    }
}
