package com.library.service;

import com.library.repository.BookRepository;

/**
 * Service class responsible for
 * business logic related to books.
 */
public class BookService {

    // Dependency object
    private BookRepository bookRepository;

    /**
     * Setter method used by Spring for
     * Dependency Injection.
     *
     * @param bookRepository Repository object
     */
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Method to display book information.
     */
    public void displayBookInfo() {
        System.out.println("Book Service is processing the request.");

        // Calling repository method
        bookRepository.getBookDetails();
        System.out.println("Book information displayed successfully.");
    }
}