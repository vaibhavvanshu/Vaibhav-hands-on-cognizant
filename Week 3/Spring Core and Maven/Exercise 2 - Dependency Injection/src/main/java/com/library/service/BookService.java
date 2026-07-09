package com.library.service;
import com.library.repository.BookRepository;

/**
 * Service class responsible for
 * processing book-related business logic.
 */
public class BookService {
    // Dependency object
    private BookRepository bookRepository;
    /**
     * Setter method used by Spring
     * for Dependency Injection.
     *
     * @param bookRepository BookRepository object
     */

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Business method.
     */
    public void issueBook() {

        System.out.println("Book Service is processing the request.");

        // Calling Repository method
        bookRepository.getBookDetails();

        System.out.println("Book issued successfully.");
    }
}