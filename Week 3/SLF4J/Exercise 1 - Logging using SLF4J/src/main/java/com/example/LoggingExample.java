package com.example;

// Importing SLF4J Logger classes
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Creating a Logger object for this class
    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // Logging an error message
        logger.error("This is an error message.");

        // Logging a warning message
        logger.warn("This is a warning message.");

        // Displaying a message indicating successful execution
        System.out.println("Logging completed successfully.");
    }
}

/**
 * Output
 * 13:58:35.573 [main] ERROR com.example.LoggingExample - This is an error message.
 * 13:58:35.574 [main] WARN com.example.LoggingExample - This is a warning message.
 * Logging completed successfully.
 */