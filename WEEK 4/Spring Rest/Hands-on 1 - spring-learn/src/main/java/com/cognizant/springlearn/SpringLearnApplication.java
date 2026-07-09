package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the Spring Learn application.
 * This class bootstraps the Spring Boot application.
 */
@SpringBootApplication
public class SpringLearnApplication {

    // Logger object to print application logs
    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        // Start the Spring Boot application
        SpringApplication.run(SpringLearnApplication.class, args);

        // Verify that the main method has been executed
        LOGGER.info("Inside main method of SpringLearnApplication");
    }
}