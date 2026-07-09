package com.cognizant.handson4springconfigurationxml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HandsOn4SpringConfigurationXmlApplication {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(HandsOn4SpringConfigurationXmlApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Inside main()");
        displayCountry();
    }

    /**
     * Reads the Country bean from Spring XML configuration
     * and displays its details.
     */
    public static void displayCountry() {
        LOGGER.info("Start");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);
        LOGGER.info("Country : {}", country);
        LOGGER.info("End");
    }
}